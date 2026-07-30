import java.util.*;
import java.math.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 각 배열 A, B에서 한 숫자를 뽑아 두 수를 곱합
        // 배열의 길이만큼 반복, 배열의 길이는 A,B가 같음. 
        // 두 수를 곱한 값을 누적하여 더하되, 이 누적값이 최소가 되어야함. 
        // 누적값 최소는 최소값*최대값 의 누적값이 합의 최소가 됨
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 정렬 후, B의 경우는 역순 정렬이 아닌 뒤에서부터 탐색
        for(int i = 0; i < A.length; i++){
            answer += A[i]*B[B.length - 1 - i];
        }
        
        return answer;
    }
}