import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Arrays.sort(scoville);

        while(scoville[0] < K) { 

            if (scoville.length < 2) {
                return -1;
            }

            int[] scovilleCopy = new int[scoville.length - 1];

            System.arraycopy(scoville, 2, scovilleCopy, 1, scoville.length - 2);
            scovilleCopy[0] = scoville[0] + (scoville[1] * 2);
            scoville = scovilleCopy;

            answer++;

            Arrays.sort(scoville);
        }

        // for (int a : scoville) {
        //     System.out.println(a);
        // }

        return answer;
    }
}

