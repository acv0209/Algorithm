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
        
        // 티켓 수 및 id 별 로그 저장을 위한 map 선언 
        int tickets = totalTicket;
        TreeMap<String, String> map = new TreeMap<String, String>();
        
        // 접속 1분 유지 정책에 따른 가장 최근 로그인 시간 확인
        String lastLogintime = null;
        for (String log : logs) {
            
            // 로그를 가져와 아이디 상태 시간으로 나눈다 
        	String[] logArray = log.split(" ");
        	String id = logArray[0];
            String status = logArray[1];
        	String time = logArray[2];
        	
            // 첫 로그인시 저장된 날짜 없으므로 시간 저장 
        	if (lastLogintime == null) {
        		lastLogintime = time;
        	} else {
                
                // 가장 최근에 로그인 시간과 현재 로그 시간 차이 계산
        		String[] lastLogintimeSplit = lastLogintime.split(":");
        		String[] timeSplit = time.split(":");
        		int minDiff = Integer.parseInt(timeSplit[1]) - Integer.parseInt(lastLogintimeSplit[1]);
        		int diff = Integer.parseInt(timeSplit[2]) - Integer.parseInt(lastLogintimeSplit[2]) + (minDiff * 60);
        		
        		// 만약 1분이 넘지 않고 leave 메시지일 경우 해당 유저 제거 
        		lastLogintime = time;
        		if (diff < 60) {
        			if (status.equals("leave") && map.containsKey(id)) {
        				map.remove(id);
        				tickets++;
        			}
        			continue;
        		}
        	}
        	
            // request 요청일 경우 이미 구매한 유저의 접속은 무시하고 새로운 유저일 경우 티켓을 우선 확보한다 
        	if (status.equals("request")) {
                if (map.containsKey(id)) {
        				continue;
        		}
                
                // 접속 1분 유지가 구매 성공 조건이므로 분 단위가 59분인 유저는 구매할 수 없다 
                if (time.split(":")[1].equals("59")) {
        				continue;
        		}
                
        		map.put(id, time);
        		tickets--;
        	} 
        	
            // 1
            
        } //for
        
        // key 값을 id로 저장한 map을 배열로 바꿔 반환한다 
        Set set = map.keySet();
        answer = (String[]) set.toArray(answer);
        return answer;
    }
}









