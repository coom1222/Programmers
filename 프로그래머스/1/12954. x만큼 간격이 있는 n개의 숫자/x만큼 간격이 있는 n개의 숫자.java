class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
    
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x + (long) x*i;    // 인트끼리 계산하다 오버플로우. int는 21억까지만 표현가능
        }
        
        return answer;
    }
}