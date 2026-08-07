import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int hap = yellow + brown;
        
        // 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫
        // 테두리가 1줄이라는 것은, 상하좌우 각각 1칸씩 차지함으로, 
        // 노란색이 가질 수 있는 내부는 전체 사각형의 가로, 세로에서 -2씩 해야한다. 
        // 이를 한번에 찾을 수 없으므로, 완전탐색을 진행해야 한다. 
        
        for(int height = 3; height <= Math.sqrt(hap); height++){
            
            if (hap % height == 0){         // 나누어 떨어질 때만 약수
                int width = hap / height;   // 가로 길이 구하기
                
                // 노랑 갯수 확인
                if ((width - 2) * (height - 2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}