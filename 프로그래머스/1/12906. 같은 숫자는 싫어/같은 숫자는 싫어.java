import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt = 1;
        // arr.length 만큼의 배열 선언
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        // 1. 입력된 배열을 순회하며 연속 숫자 탐색
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {    // 2. 연속이라면 cnt 추가
                // 3. 연속인 숫자 저장
                answer[cnt] = arr[i];
                cnt++;
            }
            
        }
        
        int[] fuck = Arrays.copyOf(answer, cnt);
        
        return fuck;
    }
    
}