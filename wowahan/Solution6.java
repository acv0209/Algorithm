import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int result = solution({97, 98}, {197, 198});
//        System.out.println(result);
    }
public int solution(int[] pobi, int[] crong) {
        
        // 어떤 로직도 거치지 않을 경우 예외사항인 -1 출력
        int answer = -1;
        
        // 연속된 페이지는 1페이지가 차이나야 한다 
        int diff1 = pobi[1] - pobi[0];
        int diff2 = crong[1] - crong[0];
        
        if (diff1 != 1)	{
        	return answer;
        }
        
        if (diff2 != 1)	{
        	return answer;
        }
        
        // 왼쪽 페이지 홀수, 오른쪽 페이지 짝수 체크
        if (pobi[0] % 2 != 1) {
            return answer;
        } 
        if (crong[0] % 2 != 1) {
            return answer;
        }
        
        if (pobi[1] % 2 != 0) {
            return answer;
        } 
        if (crong[1] % 2 != 0) {
            return answer;
        }
        
        // 왼쪽 페이지 오른쪽 페이지 각각 최대값을 구한 후 그 중 최대값을 비교한다 
        int pobiNumber = max(calculate(pobi[0]), calculate(pobi[1]));
        int crongNumber = max(calculate(crong[0]), calculate(crong[1]));
        
        // 포비가 이길 경우 1, 크롱이 이길 경우 2, 비길 경우 0 
        if (pobiNumber > crongNumber) {
        	answer = 1;
        } else if (pobiNumber < crongNumber) {
        	answer = 2;
        } else if (pobiNumber == crongNumber) {
        	answer = 0;
        } 
        
        return answer;
    }
    
    // 최대값 반환 함수 
    public static int max(int a, int b) {
    	if (a > b) {
    		return a;
    	} else {
    		return b;
    	}
    }
    
    // 페이지 번호 각 자릿수 더하기 또는 곱합기 함수 
    public static int calculate(int pageNumber) {
    	int plusNumbers = 0;
    	int multiplyNumbers = 1;
    	
    	while (pageNumber > 1) {
    		int number = pageNumber % 10;
    		plusNumbers += number;
    		multiplyNumbers *= number;
    		pageNumber /= 10;
    	}
    	
    	return max(plusNumbers, multiplyNumbers);
    }
}









