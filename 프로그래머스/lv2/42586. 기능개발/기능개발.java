import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployCntList = new ArrayList<>();
        int currentDeployDay = 0;
        int count = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            //배포에 걸리는 날짜 구하기
            int day = (100-progress) % speed != 0 ? 
                ((100-progress) / speed) + 1 : (100-progress) / speed;
            
            if (count == 0) {
                currentDeployDay = day;
                count = 1;
            } else if (currentDeployDay >= day) {
                count += 1;
            } else {
                deployCntList.add(count);
                count = 1;
                currentDeployDay = day;
            }
        }
        deployCntList.add(count);
        
        int[] answer = new int[deployCntList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = deployCntList.get(i);
        }
        
        return answer;
    }
}