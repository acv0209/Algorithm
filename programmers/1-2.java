class Solution {
  public String solution(String phone_number) {
      String answer = "";

      int length = phone_number.length();
      char[] cArray = phone_number.toCharArray();

      for (int i = 0; i < length - 4; i++) {
          cArray[i] = '*';
      }

      answer = new String(cArray);
      return answer;
  }
}

