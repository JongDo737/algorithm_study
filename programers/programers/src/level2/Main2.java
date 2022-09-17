package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] numbers = {6,10,2};
		System.out.println(sol.solution(numbers));
		

	}

}
//
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> str = new ArrayList<>();
        int max = 0;
        for(int i=0; i<numbers.length;i++) {
        	str.add(numbers[i]+"");
        	System.out.println(str.get(i));
        }
        while(true) {
        	if(str.size()==0) break;
        	int index=-1;
        	for(int i=0; i<str.size();i++) {
            	System.out.print(str.get(i)+" ");
            	
            }
        	System.out.println();
        	for(int i=0; i<str.size(); i++) {
            	max=0;
            	if(str.get(i).charAt(0)>max) {
            		max = Integer.parseInt(str.get(i).charAt(0)+"");
            		index = i;
            	}else if(str.get(i).charAt(0)==max) {
            		System.out.println(Integer.parseInt(str.get(i)+"Integer.parseInt(str.get(i)"));
            		if(Integer.parseInt(str.get(i))>=Integer.parseInt(str.get(index))) {
            			String large = str.get(i);
            			String small = str.get(index);
            			System.out.println("large :" +large);
            			if(Integer.parseInt(large+small)> Integer.parseInt(small+large)){
            				 index=i;
            			}
            			else index=index;
            			
            		}
            	}
            	
            }
        	System.out.println(str.get(index));
        	System.out.println("max : "+max);
        	answer+=str.get(index);
        	str.remove(index);
        }
       
        
        return answer;
    }
}