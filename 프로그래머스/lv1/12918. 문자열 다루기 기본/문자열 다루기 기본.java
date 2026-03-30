class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (char ch : s.toCharArray()) {
            if (!isInteger(ch + "")) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isInteger(String word) {
        try {
            int number = Integer.parseInt(word);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}