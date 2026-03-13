import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        
        for (int i = 0; i < sb.length(); i++) {
            answer += sb.charAt(i) - '0';
        }
       

        return answer;
    }
}