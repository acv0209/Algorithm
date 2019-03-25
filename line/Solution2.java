import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

//6
//id name occupation
//5 Brown Accountant
//2 Cony Programmer
//3 Sally Doctor
//1 James Singer
//4 Moon Dancer
//7
//id city zip
//2 Seoul 10008
//7 Busan 40002
//5 Gwangju 20009
//6 Daegu 30008
//3 Seoul 40005
//1 Seoul 50006

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int leftRows = sc.nextInt() - 1;
        sc.nextLine();
        
        String leftHeader = sc.nextLine();
        
        TreeMap<Integer, ArrayList<String>> resultTable = new TreeMap<Integer, ArrayList<String>>();
        
        for (int i = 0; i < leftRows; i++) {
        	String line = sc.nextLine();
//        	System.out.println(line);
        	
        	String[] row = line.split(" ");
//        	System.out.println(row[0]);
        	
        	int id = Integer.parseInt(row[0]);
        	ArrayList<String> value = new ArrayList<String>();
        	
        	for (int j = 1; j < row.length; j++) {
        		value.add(row[j]);
        	} //for
        	resultTable.put(id, value);
        } //for
        
        int rightRows = sc.nextInt() - 1;
        sc.nextLine();
        
        String rightHeader = sc.nextLine();
        
        for (int i = 0; i < rightRows; i++) {
        	String line = sc.nextLine();
        	String[] row = line.split(" ");
        	int id = Integer.parseInt(row[0]);
        	
        	if(resultTable.containsKey(id)) {
        		ArrayList<String> value = resultTable.get(id);

        		for (int j = 1; j < row.length; j++) {
            		value.add(row[j]);
            	} //for
        	}
        	
        } //for
        
        ArrayList<String> resultHeader = new ArrayList<String>();
        String[] leftSplit = leftHeader.split(" ");
        int count = 0;
        
        for (String l : leftSplit) {
        	resultHeader.add(l);
        	count++;
        } //for
        
        String[] rightSplit = rightHeader.split(" ");
        
        for (int i = 1; i < rightSplit.length; i++) {
        	resultHeader.add(rightSplit[i]);
        	count++;
        } //for
        
        int resultColumns = count - 1;
        
        for (String column : resultHeader) {
        	System.out.print(column + " ");
        } //for
        System.out.println();
        
        for (int i = 1; i <= leftRows; i++) {
        	ArrayList<String> value = resultTable.get(i);
        	
        	System.out.print(i + " ");
        	
        	for (String data : value) {
        		System.out.print(data + " ");
        	} //for
        	
        	int valueNumbers = value.size();
        	if (valueNumbers < resultColumns) {
        		int nullNumbers = resultColumns - valueNumbers;
        		for(int j = 0; j < nullNumbers; j++) {
        			System.out.print("NULL ");
        		} //for
        	}
        	
        	System.out.println();
        	
        	
        } //for
    } 
}