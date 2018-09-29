import java.io.*;
import java.util.*;

class Main {
	static int[][] matrix;
	static ArrayList<Integer> numbers = new ArrayList<>();
	static int count;
	static int n;
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		matrix = new int[n][n];
		
		// insert the matrix 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int area = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1) {
					count = 0;
					area =area + 1;
					findArea(i, j);
					numbers.add(count);
				}
			}
		}
		
		Collections.sort(numbers); 
		
		System.out.println(area);
		
		for (int number : numbers) {
			System.out.print(number + " ");		
		}
	}
	
	public static void findArea(int widthIndex, int heightIndex) {
		if (widthIndex < 0)	return;
		if (heightIndex< 0)	return;
		if (widthIndex >= n)	return;
		if (heightIndex >= n)	return;
		if (matrix[widthIndex][heightIndex] == 1) {
			matrix[widthIndex][heightIndex] = 0;
			count = count + 1;
			findArea(widthIndex+1, heightIndex);
			findArea(widthIndex-1, heightIndex);
			findArea(widthIndex, heightIndex+1);
			findArea(widthIndex, heightIndex-1);
		}
	}
}






