import java.util.*;

class Solution {
    public int[] solution(long n) {
        String string = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(string);
        String result = sb.reverse().toString();
        
        char[] charResult = result.toCharArray();
        
        int[] answer = new int[charResult.length];
        
        for (int i = 0; i < charResult.length; i++){
            answer[i] = charResult[i] - '0';
        }
        
        return answer;
    }
}