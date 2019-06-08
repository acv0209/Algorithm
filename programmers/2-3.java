import java.util.*;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        // int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        int length = A.length; 

        for (int i = 0; i < length; i++) {
            sum += A[i] * B[length - i - 1];
        } //for 

        return sum;
    }
}
