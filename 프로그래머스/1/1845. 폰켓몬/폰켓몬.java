import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length;
        
        Set <Integer> set = new HashSet<>();
        
        // System.out.println(gajisu);
        
        for(int num : nums) {
            set.add(num);
            //System.out.println(set);
        }
        
        // 조건 : num.length; 마리의 폰캣몬 수 , n/2의 폰켓몬을 고르면 됨
        // 근데 중복은 안됨. 그래서 일단 중복 제외한 종류 수를 알아야 함.  
        int setSize = set.size();   
        
        // 그리고 중복을 제거한 종류 수와, n/2를 비교, 종류 수가 n/2보다 작다면 n/2를 출력하면 될듯. 
        answer = setSize < nums.length/2 ? setSize : nums.length/2;
        
        return answer;
        
    }
}