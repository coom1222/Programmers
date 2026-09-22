import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 탐색 종료 범위 (초기값: 배열의 크기 N)
        int endIdx = N;
        
        // 첫 번째 원소(인덱스 0)가 선택되어 endIdx가 0이 될 때까지 반복
        while (endIdx > 0) {
            int max_value = Integer.MIN_VALUE;
            int max_idx = -1;
            
            // 0부터 endIdx - 1 까지만 탐색
            for (int i = 0; i < endIdx; i++) {
                // 초과(>) 조건으로 갱신해야 같은 최댓값이 있을 때 가장 왼쪽의 인덱스가 유지됨
                if (arr[i] > max_value) {
                    max_value = arr[i];
                    max_idx = i;
                }
            }
            
            // 문제에서 요구하는 위치는 1-based index이므로 +1 해서 출력
            System.out.print((max_idx + 1) + " ");
            
            // 다음 탐색 범위는 방금 찾은 최댓값의 바로 왼쪽까지로 축소
            endIdx = max_idx;
        }
    }
}