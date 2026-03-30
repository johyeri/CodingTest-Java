class Solution {
    public int solution(String s) {
        int result = s.length();

        for (int i=1; i <= s.length()/2; i++) {
           int count = 1;

           StringBuilder sb = new StringBuilder();
           String prev = s.substring(0, i);
           String str = "";

           for (int j=i; j < s.length(); j+=i) {

              if (s.length() < i+j) {
                 str = s.substring(j);
              } else if (s.length() >= i+j) {
                 str = s.substring(j, i+j);
              }

              if (str.equals(prev)) {
                 count++;
              } else {
                 if (count == 1) sb.append(prev);
                 else sb.append(count + prev);

                 count = 1;
                 prev = str;
              }
           }

           if (count == 1) sb.append(prev);
              else sb.append(count).append(prev);

           if (result > sb.length()) {
              result = sb.length();
           }
        }

        return result;
    }
}