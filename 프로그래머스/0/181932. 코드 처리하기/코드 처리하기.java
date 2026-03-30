class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for(int idx=0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            if (ch == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (mode == 0) {
                if (idx % 2 == 0) {
                    ret+=ch;
                }
            } else if (mode == 1) {
                if (idx % 2 != 0) {
                    ret+=ch;
                }
            }
        }
        
        if ("".equals(ret)) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}