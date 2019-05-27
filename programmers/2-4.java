class Solution {
  public int solution(int[] arr) {
      int answer = 1;
      int length = arr.length;

      for (int a : arr) {
          int temp = -1; 
          if ( answer < a) {
              temp = commonMultiple(answer, a);
          } else { 
              temp = commonMultiple(a, answer);
          }
          answer = temp;
      } //for 

      return answer;
  }

  public int commonMultiple(int a, int b) {
      int result = 1;
      int i = 2;
      while (i < a) {
          if (a % i == 0) {
              if (b % i == 0) {
                  a /= i;
                  b /= i;
                  result *= i;
              }else {
                  i++;
              }
          }else {
              i++;
          }
      }

      result = result * a * b;
      return result;
  }
}

