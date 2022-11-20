package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private List<String> bridge;
    private List<String> gameState;
    int count;      // 입력 개수
    private boolean isSuccess;
    public BridgeGame(List<String> bridge) {
        this.bridge = bridge;
        isSuccess = false;
        gameState = new ArrayList<>();
    }
    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String crossTheBridge) {
        if(bridge.get(count).equals(crossTheBridge)){
            // 건너기 성공
            gameState.add(bridge.get(count));
            count++;
            if(bridge.size() == count) {
                // 게임 승리 (종료)
                isSuccess = true;
                return false;
            }
            // 게임 계속 진행
            isSuccess = true;
            return true;

        }
        gameState.add(crossTheBridge);
        // 건너기 실패 (종료)
        isSuccess = false;
        return false;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry(String whetherRetryGame) {
        if(whetherRetryGame.equals("R")){
            return true;
        }
        if(whetherRetryGame.equals("Q")){
            return false;
        }
        return false;
    }

    // 게임 상황을 반환해주는 메서드
    public List<String> getGameState() {
        return gameState;
    }
    // 다리 개수를 반환 해주는 메서드
    public int getBridgeSize(){
        return bridge.size();
    }
    public boolean getIsSuccess(){
        return isSuccess;
    }
}
