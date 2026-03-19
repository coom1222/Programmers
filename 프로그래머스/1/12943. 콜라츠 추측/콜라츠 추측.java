class Solution {
    public int solution(long num) {
        return collatz(num, 0);
    }
    
    private int collatz(long num, int count){
        if (num == 1) {
            return count;
        }
        
        if (count == 500) {
            return -1;
        }
        
        // 재귀 호출, 지정된 조건문을 수행하고 카운트를 증가시켜 자기 자신 호출
        if (num % 2 == 0) {
            return collatz(num / 2, count + 1);
        } else {
            return collatz(num * 3 + 1, count + 1);
        }
    }
}