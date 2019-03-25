import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//    	System.out.println(solution([[10, 0, 30, 5], [0, 30, 20, 50], [30, 30, 40, 40]], [[15, 15, 25, 25], [40, 10, 50, 20]], [10, 10, 30, 30]));
    }
    class Solution {
        public boolean solution(int[][] lands, int[][] wells, int[] point) {
            boolean answer = true;
            
            // �о�������� ����Ʈ ��ǥ x1 y1 x2 y2
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            
            // �׸�ó�� ���ڰ� ���� ��ǥ�� ���� ��ǥ���� ū ��ǥ�� ū ��ǥ���� ������ 
            if (x1 > x2) {
            	int temp = x1;
            	x1 = x2;
            	x2 = x1;
            }
            
            if (y1 > y2) {
            	int temp = y1;
            	y1 = y2;
            	y2 = y1;
            }
            
            
            // �ļ��� ���� ������ Ȯ���ϱ� ���� ��ǥ x1 y1 x2 y2
            for (int[] well : wells) {
            	int a1 = well[0];
            	int b1 = well[1];
            	int a2 = well[2];
            	int b2 = well[3];
            	
                // ���������� ���� ��ǥ�� ���� ��ǥ���� ū ��ǥ�� ū ��ǥ���� ������
            	if (a1 > a2) {
                	int temp = a1;
                	a1 = a2;
                	a2 = a1;
                }
                
                if (b1 > b2) {
                	int temp = b1;
                	b1 = b2;
                	b2 = b1;
                }
            	
                // �ļ��� ������ üũ�Ѵ� 
            	if (x1 <= a1 && a2 <= x2) {
            		continue;
            	} else if (y1 <= b1 && b2 <= y2) {
            		continue;
            	} else {
            		return false;
            	}
            } //for
            
            // ���� ������ ħ���ϴ��� Ȯ���ϴ� ��ǥ x1 y1 x2 y2
            for (int[] land : lands) {
            	int a1 = land[0];
            	int b1 = land[1];
            	int a2 = land[2];
            	int b2 = land[3];
            	
                // ���������� ���� ��ǥ�� ���� ��ǥ���� ū ��ǥ�� ū ��ǥ���� ������
            	if (a1 > a2) {
                	int temp = a1;
                	a1 = a2;
                	a2 = a1;
                }
                
                if (b1 > b2) {
                	int temp = b1;
                	b1 = b2;
                	b2 = b1;
                }
            	
                // ħ���� ��� üũ ���̽� 1
                if (a1 < x1 && x1 < a2) {
                	if (b1 < y1 && y1 < b2) {
                    	return false;
                    }
                }
                
                // ħ���� ��� üũ ���̽� 2
                if (x1 < a1 && a1 < x2) {
                	if (y1 < b1 && b1 < y2) {
                    	return false;
                    }
                }
                
            } //for

            return answer;
        }
    }
}









