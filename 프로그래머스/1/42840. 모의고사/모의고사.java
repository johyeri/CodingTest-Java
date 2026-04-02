/**
 * 접근: 각 수포자의 반복 패턴을 따라 answers를 채점하고, 최고점을 받은 사람을 배열로 반환
 * 시간복잡도: O(n)
 *
 * 풀이 메모:
 * - 각 수포자의 찍기 패턴을 배열로 선언
 * - answers를 순회하면서 현재 패턴 인덱스와 비교해 점수를 계산
 * - 세 사람의 점수 중 최댓값을 구한 뒤, 최댓값과 같은 사람 번호를 결과에 담아 반환
 * - 결과를 1, 2, 3 순서대로 담기 때문에 별도 정렬은 필요 없음
 */

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
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}