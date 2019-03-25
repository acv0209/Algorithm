import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int result = solution({97, 98}, {197, 198});
//        System.out.println(result);
    }
    public int solution(int number) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
        	int temp = i;
        	while ( temp > 1) {
        		int checkThree = temp % 10;
        		if (checkThree == 3) {
        			answer++;
        		}
        		if (checkThree == 6) {
        			answer++;
        		}
        		if (checkThree == 9) {
        			answer++;
        		}
        		temp /= 10;
        	}
        } //for
        
//        while (pageNumber > 1) {
//    		int number = pageNumber % 10;
//    		plusNumbers += number;
//    		multiplyNumbers *= number;
//    		pageNumber /= 10;
//    	}
        
        return answer;
    }
}









