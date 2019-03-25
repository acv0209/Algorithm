import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        int result = solution({97, 98}, {197, 198});
//        System.out.println(result);
    }
    public String[] solution(int totalTicket, String[] logs) {
        String[] answer = {};
        
        // Ƽ�� �� �� id �� �α� ������ ���� map ���� 
        int tickets = totalTicket;
        TreeMap<String, String> map = new TreeMap<String, String>();
        
        // ���� 1�� ���� ��å�� ���� ���� �ֱ� �α��� �ð� Ȯ��
        String lastLogintime = null;
        for (String log : logs) {
            
            // �α׸� ������ ���̵� ���� �ð����� ������ 
        	String[] logArray = log.split(" ");
        	String id = logArray[0];
            String status = logArray[1];
        	String time = logArray[2];
        	
            // ù �α��ν� ����� ��¥ �����Ƿ� �ð� ���� 
        	if (lastLogintime == null) {
        		lastLogintime = time;
        	} else {
                
                // ���� �ֱٿ� �α��� �ð��� ���� �α� �ð� ���� ���
        		String[] lastLogintimeSplit = lastLogintime.split(":");
        		String[] timeSplit = time.split(":");
        		int minDiff = Integer.parseInt(timeSplit[1]) - Integer.parseInt(lastLogintimeSplit[1]);
        		int diff = Integer.parseInt(timeSplit[2]) - Integer.parseInt(lastLogintimeSplit[2]) + (minDiff * 60);
        		
        		// ���� 1���� ���� �ʰ� leave �޽����� ��� �ش� ���� ���� 
        		lastLogintime = time;
        		if (diff < 60) {
        			if (status.equals("leave") && map.containsKey(id)) {
        				map.remove(id);
        				tickets++;
        			}
        			continue;
        		}
        	}
        	
            // request ��û�� ��� �̹� ������ ������ ������ �����ϰ� ���ο� ������ ��� Ƽ���� �켱 Ȯ���Ѵ� 
        	if (status.equals("request")) {
                if (map.containsKey(id)) {
        				continue;
        		}
                
                // ���� 1�� ������ ���� ���� �����̹Ƿ� �� ������ 59���� ������ ������ �� ���� 
                if (time.split(":")[1].equals("59")) {
        				continue;
        		}
                
        		map.put(id, time);
        		tickets--;
        	} 
        	
            // 1
            
        } //for
        
        // key ���� id�� ������ map�� �迭�� �ٲ� ��ȯ�Ѵ� 
        Set set = map.keySet();
        answer = (String[]) set.toArray(answer);
        return answer;
    }
}









