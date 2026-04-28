import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        // 빠른 조회를 위해 모든 전화번호를 HashSet에 저장
        HashSet<String> set = new HashSet<>();
        for(String num : phone_book) {
            set.add(num);
        }
        
        // 모든 전화번호를 순회하며 접두어 여부 확인
        for(int i = 0; i < phone_book.length; i++) {
            String jub = phone_book[i];
            
            // jub을 앞에서부터 한 글자씩 늘려가며 자르기
            for(int j = 1; j <= jub.length(); j++) {
                
                if (set.contains(jub.substring(0, j))) {
                    // 자기 자신과 일치하는 경우는 접두어가 아니므로 스킵
                    if (j == jub.length()) continue;
                    // 다른 번호가 접두어인 경우 false 반환
                    return false;
                }
            }
        }
        // 접두어가 존재하지 않으면 true 반환
        return true;
    }
}