package backjoon;

public class Main14 {
	public static void main(String args[]) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		int count =0;
		
		

		String[][] record_detail = new String[record.length][3];

		for (int i = 0; i < record.length; i++) {
			record_detail[i] = record[i].split(" ");
		}

		
		for (int i = 1; i < record.length; i++) {
			if(record_detail[i][0].equals("Leave")) {
				continue;
			}
			else if(record_detail[i][0].equals("Enter")) {
				for(int j =0; j < i; j++) {
					if(record_detail[j][0].equals("Leave")) {
						continue;
					}
					else if(record_detail[i][1].equals(record_detail[j][1])) {
						record_detail[j][2] = record_detail[i][2];
					}
			
				}
			}
			else if(record_detail[i][0].equals("Change")) {
				count ++;
				for(int j =0; j < i; j++) {
					if(record_detail[j][0].equals("Leave")) {
						continue;
					}
					else if(record_detail[i][1].equals(record_detail[j][1])) {
						record_detail[j][2] = record_detail[i][2];
					}
					
				}
			}
			
		}
		String[] answer = new String[record.length-count];
		int temp;
		for (int i=0; i< record.length; i++) {
			String str = record_detail[i][0];
				
			if(str.equals("Enter")) {
				answer[i] = record_detail[i][2] + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			}else if(str.equals("Leave")) {
				
				for(temp=0; temp<record.length; temp++ ) {
					if(record_detail[i][1].equals(record_detail[temp][1]) && temp !=i) {
						break;
					}
				}
				answer[i] = record_detail[temp][2] + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}else	{	//"Change"
				
				
			}
			
			
			
		}
		for(int i=0; i<answer.length && answer[i]!=null; i++) {
			System.out.println(answer[i]);
		}

		// return answer;

	}
}
