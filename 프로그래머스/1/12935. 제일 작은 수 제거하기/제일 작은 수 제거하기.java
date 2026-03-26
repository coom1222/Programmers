class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        // 답 저장할 배열 선언
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        
        // 최솟값 탐색
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // 찾은값과 배열의 값만 답안 배열에 저장(min 빼기)
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                answer[index] = arr[i];
                index++;
            }
        }
        
             
        return answer;
    }
}