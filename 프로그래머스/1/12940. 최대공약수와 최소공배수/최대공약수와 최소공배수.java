class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int GCD = gcd(n,m);
        int LCM = n*m / GCD;
        answer[0] = GCD;
        answer[1] = LCM;
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int r = 0;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}