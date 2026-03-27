import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열을 문자배열로 변경
        char[] charArray = s.toCharArray();
        // 오름차순 정렬
        Arrays.sort(charArray);
        System.out.println(charArray);
        
        StringBuilder sb = new StringBuilder(new String(charArray));
        
        
        answer = sb.reverse().toString();
        
        return answer;
    }
}