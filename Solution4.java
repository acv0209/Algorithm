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
            
            // 분양받으려는 포인트 좌표 x1 y1 x2 y2
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            
            // 그림처럼 숫자가 작은 좌표는 작은 좌표끼리 큰 좌표는 큰 좌표끼리 모은다 
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
            
            
            // 식수원 포함 유무를 확인하기 위한 좌표 x1 y1 x2 y2
            for (int[] well : wells) {
            	int a1 = well[0];
            	int b1 = well[1];
            	int a2 = well[2];
            	int b2 = well[3];
            	
                // 마찬가지로 작은 좌표는 작은 좌표끼리 큰 좌표는 큰 좌표끼리 모은다
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
            	
                // 식수원 유무를 체크한다 
            	if (x1 <= a1 && a2 <= x2) {
            		continue;
            	} else if (y1 <= b1 && b2 <= y2) {
            		continue;
            	} else {
            		return false;
            	}
            } //for
            
            // 토지 영역을 침범하는지 확인하는 좌표 x1 y1 x2 y2
            for (int[] land : lands) {
            	int a1 = land[0];
            	int b1 = land[1];
            	int a2 = land[2];
            	int b2 = land[3];
            	
                // 마찬가지로 작은 좌표는 작은 좌표끼리 큰 좌표는 큰 좌표끼리 모은다
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
            	
                // 침범할 경우 체크 케이스 1
                if (a1 < x1 && x1 < a2) {
                	if (b1 < y1 && y1 < b2) {
                    	return false;
                    }
                }
                
                // 침범할 경우 체크 케이스 2
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









