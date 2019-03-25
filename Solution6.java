import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int result = solution({97, 98}, {197, 198});
//        System.out.println(result);
    }
public int solution(int[] pobi, int[] crong) {
        
        // � ������ ��ġ�� ���� ��� ���ܻ����� -1 ���
        int answer = -1;
        
        // ���ӵ� �������� 1�������� ���̳��� �Ѵ� 
        int diff1 = pobi[1] - pobi[0];
        int diff2 = crong[1] - crong[0];
        
        if (diff1 != 1)	{
        	return answer;
        }
        
        if (diff2 != 1)	{
        	return answer;
        }
        
        // ���� ������ Ȧ��, ������ ������ ¦�� üũ
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
        
        // ���� ������ ������ ������ ���� �ִ밪�� ���� �� �� �� �ִ밪�� ���Ѵ� 
        int pobiNumber = max(calculate(pobi[0]), calculate(pobi[1]));
        int crongNumber = max(calculate(crong[0]), calculate(crong[1]));
        
        // ���� �̱� ��� 1, ũ���� �̱� ��� 2, ��� ��� 0 
        if (pobiNumber > crongNumber) {
        	answer = 1;
        } else if (pobiNumber < crongNumber) {
        	answer = 2;
        } else if (pobiNumber == crongNumber) {
        	answer = 0;
        } 
        
        return answer;
    }
    
    // �ִ밪 ��ȯ �Լ� 
    public static int max(int a, int b) {
    	if (a > b) {
    		return a;
    	} else {
    		return b;
    	}
    }
    
    // ������ ��ȣ �� �ڸ��� ���ϱ� �Ǵ� ���ձ� �Լ� 
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









