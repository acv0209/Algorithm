// 4 -> 2 -> 1
// 7 -> 3 -> 1 

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        a--;
        b--;
        
        while (n/2 > 1) {
            a /= 2;
            b /= 2;
            
            if (a == b) {
                break;
            }
            
            answer++;
            n /= 2;
        }
        
        return answer;
    }
}
