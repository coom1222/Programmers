class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        
        while(i < absolutes.length){
            if (signs[i] == true){
                answer += absolutes[i];
                i++;
            }else if (signs[i] == false){
                answer -= absolutes[i];
                i++;
            }
        }
        // 또는 
        /*
        for (int i = i; i < absolutes.length; i++){
            if (singhs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        */
        
        return answer;
    }
}