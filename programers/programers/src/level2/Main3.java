package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		sol.solution(record);

	}

}

class Solution2 {
	public String[] solution(String[] record) {
		String[] answer = {};
		answer = new String[record.length];
		String[][] arrStr = new String[record.length][];
		for (int i = 0; i < record.length; i++) {
			arrStr[i] = record[i].split(" ");
		}
		int count=0;
		Map<String, String> userMap = new HashMap<>(); // Ű�� : username value : nickname
		List<String> usernameList = new ArrayList<>();

		for (int i = 0; i < arrStr.length; i++) {
			if (!userMap.containsKey(arrStr[i][1])) { // ���� ������ �ȵǾ�������
				userMap.put(arrStr[i][1], arrStr[i][2]);
				usernameList.add(arrStr[i][1]);
			}
			
		}
		User[] user = new User[userMap.size()];

		for (int i = 0; i < user.length; i++) {
			user[i] = new User(usernameList.get(i), userMap.get(usernameList.get(i)));
			
		}
		for(int i=0; i<arrStr.length; i++) {
			if(arrStr[i][0].equals("Change")) {
				continue;
			}
			count++;
		}
		System.out.println(count);
		answer = new String[count];
		
		// �г��� ���� Ȯ��
		for(int i=0; i<arrStr.length; i++) {
			if(arrStr[i][0].equals("Change")) {
				for(int j=0; j<user.length; j++) {
					
					if(user[j].username.equals(arrStr[i][1]) ) {
						user[j].changeNickname(arrStr[i][2]);
					}
				}
			}
			if (arrStr[i][0].equals("Enter") && userMap.containsKey(arrStr[i][1])) { // ������ �ٽ� ������
				for(int j=0; j<user.length; j++) {
					
					if(user[j].username.equals(arrStr[i][1]) ) {
						user[j].changeNickname(arrStr[i][2]);
					}
				}
			}
			
		}
		for(int i=0; i<arrStr.length; i++) {
			if(arrStr[i][0].equals("Enter")) {
				for(int j=0; j<user.length; j++) {
					
					if(user[j].username.equals(arrStr[i][1]) ) {
						answer[i]=user[j].enterUser();
					}
				}
			}else if(arrStr[i][0].equals("Leave")) {
				for(int j=0; j<user.length; j++) {
					
					if(user[j].username.equals(arrStr[i][1]) ) {
						answer[i]=user[j].leaveUser();
					}
				}
			}else {
				continue;
			}
			
		}
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==null) {
				
			}
			else {
				System.out.println(answer[i]);
				
			}
		}
			
		
		return answer;
	}
}

class User {
	String username;
	String nickname;

	public User(String username, String nickname) {
		this.nickname = nickname;
		this.username = username;
	}

	public void changeNickname(String nickname) {
		this.nickname = nickname;
	}

	public String enterUser() {
		return nickname + "���� ���Խ��ϴ�.";
	}

	public String leaveUser() {
		return nickname + "���� �������ϴ�.";
	}
	public String userInfo() {
		return username +" " +nickname;
	}
}