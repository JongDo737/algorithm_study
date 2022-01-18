package kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		// ���߾�� cpp, java, python
		// ���� backend, frontend
		// ��� junior, senior
		// �ҿ�Ǫ�� chicken, pizza
		// �ڵ� �׽�Ʈ����

		// ��ü info �Է���ü�� �޾Ƽ� info�� ����
		String[] infoAll = new String[50000];
		String[] queryAll = new String[50000];

		// info ���� �����ڵ��� ��� arraylist
		List<String[]> infoList = new ArrayList();
		List<String[]> queryList = new ArrayList();

		Scanner sc = new Scanner(System.in);

		
		//info
		
		//"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"
		System.out.println("info :");
		String infomsg = sc.nextLine();
		sc.nextLine();
		int count=1;
		
		//�Է¹��� info ���� ����
		for(int i = 0; i< infomsg.length(); i++) {
			if(infomsg.charAt(i) == ',') {
				count++;
			}
		}
		
		// , ���� �����ְ�
		infoAll = infomsg.split(",");
		for (int i = 0; i<count; i++) {
			// info�� �ִ� ����ǥ�� �����ְ� �ܾ� 5�� �������� ������ش�.
			infoAll[i] = infoAll[i].replaceAll("\"", "");
		}
		
		// �������� �ܾ���� �����ְ� infoList�� �־��ش�.
		for (int i = 0; i< infoAll.length; i++) {
			String[] info = new String[5];
			info = infoAll[i].split(" ");
			infoList.add(info);
		}
		
		//�Է��׽�Ʈ
//		for (int i = 0; i < infoList.size(); i++) {
//			System.out.println(i+"��° infoList info");
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
		
		//�Է¹��� info ���� ����
		for(int i = 0; i< querymsg.length(); i++) {
			if(querymsg.charAt(i) == ',') {
				count++;
			}
		}
		
		// , ���� �����ְ�
		queryAll = querymsg.split(",");
		for (int i = 0; i<count; i++) {
			queryAll[i] = queryAll[i].replaceAll("\"", "");
			queryAll[i] = queryAll[i].replaceAll("and ", "");
			
		}
		
		// �������� �ܾ���� �����ְ� queryList�� �־��ش�.
		for (int i = 0; i< queryAll.length; i++) {
			String[] query = new String[5];
			query = queryAll[i].split(" ");
			queryList.add(query);
		}
		
		//�Է��׽�Ʈ
//		for (int i = 0; i < queryList.size(); i++) {
//			System.out.println(i+"��° queryList ");
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
		
		//���� ������ŭ ��� ���� ����
		int[] result = new int[queryList.size()];
		
		//���� 1, ����2
		for(int i =0; i< queryList.size(); i++) {
			//���� i �϶� ��ü�ο� �˻�
			for(int j=0; j<infoList.size();j++) {
				//�ο����� �´�
				int count=0; 
				
				//���� i�϶� i��° �ΰ� ������
				for(int k=0; k<infoList.get(j).length; k++) {
					//���� ��
					// '-' �̰ų� ��������� ������ ������ count ++					
					if(queryList.get(i)[k].equals("-") || queryList.get(i)[k].equals(infoList.get(j)[k])) {
						count++;
					}
					// �������ϴ� �����϶� ���� �� !
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
				//5���� ���� ��� ���� ��
				if(count==5) {
					result[i]++;
				}
			}
		}
		return result;
	}

}
