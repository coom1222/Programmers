class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        /**
        * 배열 내부를 돌면서 빼버리면 이중포문을 돌 필요가 없지
        * for(int i : numbers){
        *     answer -= i;
        * }
        */
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < 10; j++){
                if(numbers[i] == j){
                    answer -= numbers[i];
                }
            }
        }
        
        return answer;
    }
}