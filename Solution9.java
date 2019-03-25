import java.util.ArrayList;
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int result = solution({97, 98}, {197, 198});
//        System.out.println(result);
    }
    public String solution(String cryptogram) {
        String answer = "";
        
        boolean checkSequence = true;
        
        while (checkSequence) {
        	checkSequence = false;
        	ArrayList<Character> cList = new ArrayList<Character>();
        	int length = cryptogram.length();
        	for (int i = 0; i < length; i++) {
        		char c = cryptogram.charAt(i);
        		if (i == length - 1) {
        			cList.add(c);
        		}else {
        			char cNext = cryptogram.charAt(i+1);
        			if (c == cNext) {
        				checkSequence = true;
        				i++;
        			} else {
        				cList.add(c);
        			}
        		}
        	}
        	
        	StringBuilder sb = new StringBuilder();
        	for (char c : cList) {
        		sb.append(c);
        	} //for
        	cryptogram = sb.toString();
        }
        
        answer = cryptogram;
        return answer;
    }
}









