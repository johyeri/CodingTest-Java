import java.util.*;

class Song {
    int index;
    int plays;

    public Song(int index, int plays) {
        this.index = index;
        this.plays = plays;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 수
        Map<String, Integer> genreTotalMap = new HashMap<>();
        
        // 2. 장르별 노래 목록
        Map<String, List<Song>> genreSongsMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 장르별 총 재생 수 누적
            genreTotalMap.put(genre, genreTotalMap.getOrDefault(genre, 0) + play);

            // 장르별 노래 리스트 초기화
            genreSongsMap.putIfAbsent(genre, new ArrayList<>());

            // 해당 장르에 노래 추가
            genreSongsMap.get(genre).add(new Song(i, play));
        }

        // 3. 장르를 총 재생 수 기준으로 내림차순 정렬
        List<String> genreList = new ArrayList<>(genreTotalMap.keySet());
        genreList.sort((a, b) -> genreTotalMap.get(b) - genreTotalMap.get(a));

        // 4. 정답 담을 리스트
        List<Integer> answerList = new ArrayList<>();

        // 5. 장르 순서대로, 장르 내 상위 2곡 선택
        for (String genre : genreList) {
            List<Song> songs = genreSongsMap.get(genre);
           
            // 장르 내 노래 정렬
            songs.sort((a, b) -> {
                // 재생 수가 다르면 재생 수 내림차순
                if (b.plays != a.plays) {
                    return b.plays - a.plays;
                }
                // 재생 수가 같으면 고유번호 오름차순
                return a.index - b.index;
            });

            // 최대 2곡까지 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answerList.add(songs.get(i).index);
            }
        }

        // 6. List<Integer> -> int[]
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}