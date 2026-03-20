import java.util.*;

class Solution {
    public String solution(String s) {
        int len = s.length();
        int mid = len / 2;
        
        if (len % 2 == 0) {
            return "" + s.charAt(mid - 1) + s.charAt(mid);
        } else {
            return  "" + s.charAt(mid);
        }
        
        /*
        // 1. 문자열의 총 길이와 중간 위치(인덱스)를 구한다.
        int len = s.length();
        int mid = len / 2; 
        
        // 2. 짝수일 때: 가운데 '두 글자'를 자른다.
        if (len % 2 == 0) {
            // mid-1 부터 mid+1 직전(mid)까지 자름
            return s.substring(mid - 1, mid + 1); 
        } 
        // 3. 홀수일 때: 가운데 '한 글자'를 자른다.
        else {
            // mid 부터 mid+1 직전(mid)까지 자름
            return s.substring(mid, mid + 1); 
        }
        */
        
    }
}