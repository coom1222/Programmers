import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        int num = 1;
        int colIdx = 0;

        N = sc.nextInt();
        M = sc.nextInt();

        int arr[][] = new int[N][M];
        // 총 처리해야 할 대각선의 갯수는 M+N-1 개
        for(int col = 0; col < M + N - 1; col++){
            // 열 인덱스는 매 for문이 돌때마다 열값으로 초기화
            colIdx = col;

            // 열이 가로 크기의 끝보다 커지면
            if(col > M-1){    
                // N*M 안에 있을때만 숫자를 기록해야 한다. 
                for(int row = 0; row < N; row++){
                    if((colIdx >= 0) && (colIdx < M)){
                        arr[row][colIdx] = num;
                        num++;
                    } 
                    colIdx--;
                }
            } else {
                for(int row = 0; row < N; row++){
                    if(colIdx < 0){
                        break;
                    }
                    arr[row][colIdx] = num;
                    num++;
                    colIdx--;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}