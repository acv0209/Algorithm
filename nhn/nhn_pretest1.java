import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> friend = new Stack<Integer>();
		String line = scanner.nextLine();
		
		String[] items = line.split(" ");
		
		boolean flag = true;
		for (String s : items) {
			int item = Integer.parseInt(s);
			
			if (queue.remove(item)) {
					friend.push(item);
			}else {
				if (queue.size() >= 3) { 
					flag = false;
					System.out.println(queue.poll());
				}
			}
			queue.offer(item);
		}
		
		if (flag) {
			System.out.println(0);
		}
	}
}