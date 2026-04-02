import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = new int[]{1,2,3,4,5};
        int[] student2 = new int[]{2,1,2,3,2,4,2,5};
        int[] student3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
            
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        // 문제를 반복하여 채점하기
        for(int i=0; i<answers.length; i++) {
            if (answers[i] == student1[idx1]) score1++;
            if (answers[i] == student2[idx2]) score2++;
            if (answers[i] == student3[idx3]) score3++;
            
            idx1 = idx1 == 4 ? 0 : idx1+1;
            idx2 = idx2 == 7 ? 0 : idx2+1;
            idx3 = idx3 == 9 ? 0 : idx3+1;
        }
        
        int highScore = Math.max(score1, score2);
        highScore = Math.max(highScore, score3);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if (score1 == highScore) list.add(1);
        if (score2 == highScore) list.add(2);
        if (score3 == highScore) list.add(3);
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}