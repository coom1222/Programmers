import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String s) {

        String[] S = s.split(" ");
        int MAX = Integer.parseInt(S[0]);
        int MIN = Integer.parseInt(S[0]);
        
        for(int i = 0; i < S.length; i++){
            int n = Integer.parseInt(S[i]);
            if( n > MAX ){
                MAX = n;
            }
        }
        
        for(int i = 0; i < S.length; i++){
            int n = Integer.parseInt(S[i]);
            if( n < MIN ){
                MIN = n;
            }
        }
        String sMax = String.valueOf(MAX);
        String sMIN = String.valueOf(MIN);
        
        String answer = sMIN + " " + sMax;
        
        return answer;
    }
}