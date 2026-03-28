import java.util.*;

class Solution {
    public boolean solution(String s) {
        
        if (!isInt(s)) return false;
        
        if(s.length() == 4 || s.length() == 6) {
          return true;
        } else {
            return false;
        }

    }
    
    // 숫자로만 구성되어있는지 확인
    public boolean isInt(String s) {
        char[] charArray = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++) {
            if ( 64 < charArray[i] && charArray[i] < 123) return false;
        }
        
        return true;
    }
    
}