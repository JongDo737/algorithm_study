package bridge;

import java.util.List;

public class Application {
    public static InputView inputView = new InputView();
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<String> bridge = makeBridge();
        int totalCount = 1;
        while(startGame(bridge, totalCount)){
            totalCount++;
        }

    }
    public static boolean startGame(List<String> bridge, int totalCount) {
        BridgeGame bridgeGame = new BridgeGame(bridge);
        OutputView outputView = new OutputView();
        boolean continueGame = true;
        while(continueGame) {

            continueGame = isGameOver(bridgeGame);
            // 게임이 끝났을 때 (실패OR성공) && 실패일 때
            if(!continueGame && !bridgeGame.getIsSuccess()) {
                outputView.printMap(bridgeGame.getGameState(), continueGame, bridgeGame.getIsSuccess());
                String whetherRetryGame = inputView.readGameCommand();
                //true 면 R (다시)
                boolean overCheck = bridgeGame.retry(whetherRetryGame);
                if(!overCheck){
                    continueGame = false;
                }
                if(overCheck){
                    return true;
                }
            }
            outputView.printMap(bridgeGame.getGameState(), continueGame, bridgeGame.getIsSuccess());
        }
        // 최종 결과 보기
        outputView.printResult(bridgeGame.getGameState(),bridgeGame.getIsSuccess(), totalCount);
        // 게임이 완전 끝남
        return false;

    }
    public static boolean isGameOver(BridgeGame bridgeGame) {
        if(bridgeGame.move(inputView.readMoving())) {
            return true;
        }
        return false;
    }
    public static List<String> makeBridge(){
        BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
        BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

        System.out.println("다리 건너기 게임을 시작합니다.");
        int size = inputView.readBridgeSize();
        List<String> bridge = bridgeMaker.makeBridge(size);

        return bridge;
    }
}
