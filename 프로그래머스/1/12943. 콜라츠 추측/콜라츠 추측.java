class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if (num == 1){
            return answer;
        }
        for(int i = 0; i < 500; i++) {
            if(i == 499) {
                return -1;
            }
            if (num % 2 == 0) {
                num = num / 2;
                System.out.println(num);
            } else {
                num = num*3 + 1;
                System.out.println(num);
            }
            answer++;
            if (num == 1) {
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}