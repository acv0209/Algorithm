import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
        String result = solution("I love you");
        System.out.println(result);
    }
    public static String solution(String word) {
        String result = "";
        String rawCodes = "Z	Y	X	W	V	U	T	S	R	Q	P	O	N	M	L	K	J	I	H	G	F	E	D	C	B	A";
        String[] upperCodes = rawCodes.split("\t");
        
//        for (String s : codes) {
//        	System.out.println(s);
//        } // for
        
        int length = word.length();
        char[] results = new char [length];
//        char test = 'a' - (97 - 65);
//        System.out.println(test);
        
        for (int i = 0; i < length; i++) {
        	char c = word.charAt(i);
        	
        	if ('A' <= c && c <= 'Z') {
        		int index = c - 'A';
        		results[i] = upperCodes[index].charAt(0);
        	} else if ('a' <= c && c <= 'z') {
        		int index = c - 'a';
        		char temp = upperCodes[index].charAt(0);
        		results[i] = (char) (temp + (97 - 65));
        	} else {
        		results[i] = c;
        	}
        } //for
        
//        for (char c : results) {
//        	System.out.println(c);
//        }
        
        result = String.valueOf(results);
        return result;
    }
    
    
}









