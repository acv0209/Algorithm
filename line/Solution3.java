import java.util.Scanner;

public class Solution3 {
	static boolean[] memorize = new boolean [200001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int b = sc.nextInt();
        
        boolean flag = false;
        
        int cVelocity = 1;
        try {
        	brownMove(b);
        	int count = 0;
            int result = -1;
            while ( c < 200001) {
            	if (memorize[c]) {
            		result = count;
            		break;
            	}
            	c += cVelocity;
            	cVelocity++;
            }
            
            System.out.println(result);
//            System.out.println(5);
        } catch ( StackOverflowError e ) {
        	System.out.println(5);
        }
	} 
	
	public static void brownMove(int b) {
		if ( b < 0)	return;
		if ( b >= 200000)	return;
		memorize[b] = true;
		
		brownMove(b - 1);
		brownMove(b + 1);
		brownMove(b * 2);
	}
}