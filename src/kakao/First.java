package kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		// 개발언어 cpp, java, python
		// 직군 backend, frontend
		// 경력 junior, senior
		// 소울푸드 chicken, pizza
		// 코딩 테스트점수

		// 전체 info 입력전체를 받아서 info에 넣자
		String[] infoAll = new String[50000];
		String[] queryAll = new String[50000];

		// info 이후 지원자들을 담는 arraylist
		List<String[]> infoList = new ArrayList();
		List<String[]> queryList = new ArrayList();

		Scanner sc = new Scanner(System.in);

		
		//info
		
		//"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"
		System.out.println("info :");
		String infomsg = sc.nextLine();
		sc.nextLine();
		int count=1;
		
		//입력받은 info 갯수 새기
		for(int i = 0; i< infomsg.length(); i++) {
			if(infomsg.charAt(i) == ',') {
				count++;
			}
		}
		
		// , 으로 나눠주고
		infoAll = infomsg.split(",");
		for (int i = 0; i<count; i++) {
			// info에 있는 따옴표를 없애주고 단어 5개 띄워쓰기로 만들어준다.
			infoAll[i] = infoAll[i].replaceAll("\"", "");
		}
		
		// 공백으로 단어들을 나눠주고 infoList에 넣어준다.
		for (int i = 0; i< infoAll.length; i++) {
			String[] info = new String[5];
			info = infoAll[i].split(" ");
			infoList.add(info);
		}
		
		//입력테스트
//		for (int i = 0; i < infoList.size(); i++) {
//			System.out.println(i+"번째 infoList info");
//			for(int j = 0; j<5; j++) {
//				System.out.println(infoList.get(i)[j]);
//			}
//			
//		}
		
		//query
		
		//"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"
		System.out.println("query :");
		String querymsg = sc.nextLine();
		count=1;
		
		//입력받은 info 갯수 새기
		for(int i = 0; i< querymsg.length(); i++) {
			if(querymsg.charAt(i) == ',') {
				count++;
			}
		}
		
		// , 으로 나눠주고
		queryAll = querymsg.split(",");
		for (int i = 0; i<count; i++) {
			queryAll[i] = queryAll[i].replaceAll("\"", "");
			queryAll[i] = queryAll[i].replaceAll("and ", "");
			
		}
		
		// 공백으로 단어들을 나눠주고 queryList에 넣어준다.
		for (int i = 0; i< queryAll.length; i++) {
			String[] query = new String[5];
			query = queryAll[i].split(" ");
			queryList.add(query);
		}
		
		//입력테스트
//		for (int i = 0; i < queryList.size(); i++) {
//			System.out.println(i+"번째 queryList ");
//			for(int j = 0; j<queryList.get(i).length; j++) {
//				System.out.println(queryList.get(i)[j]);
//			}
//		}
		
		System.out.println();
		int[] result = solution(infoList, queryList);
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]);
			
		}
	}

	public static int[] solution(List<String[]> infoList, List<String[]> queryList) {
		
		//질문 개수만큼 결과 개수 생성
		int[] result = new int[queryList.size()];
		
		//질문 1, 질문2
		for(int i =0; i< queryList.size(); i++) {
			//질문 i 일때 전체인원 검사
			for(int j=0; j<infoList.size();j++) {
				//인원마다 맞는
				int count=0; 
				
				//질문 i일때 i번째 인간 질문비교
				for(int k=0; k<infoList.get(j).length; k++) {
					//질문 비교
					// '-' 이거나 질문내용과 조건이 같으면 count ++					
					if(queryList.get(i)[k].equals("-") || queryList.get(i)[k].equals(infoList.get(j)[k])) {
						count++;
					}
					// 점수비교하는 질문일땐 점수 비교 !
					else if(k==4){
						
						 int queryNum = Integer.parseInt(queryList.get(i)[k]);
						 int infoNum = Integer.parseInt(infoList.get(j)[k]);
						 
						if(queryList.get(i)[k].equals("-") || queryNum<= infoNum) {
							count++;
						}
					}
					else {
						break;
					}
				}
				//5가지 질문 모두 맞을 때
				if(count==5) {
					result[i]++;
				}
			}
		}
		return result;
	}

}
