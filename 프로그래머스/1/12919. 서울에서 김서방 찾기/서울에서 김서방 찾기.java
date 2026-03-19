import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        // seoul 순회
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }        
        // "Kim"이라는 문자열 발견하면 answer에 추가
        String answer = "김서방은 " + index + "에 있다";
        System.out.println(answer);
        return answer;
    }
}