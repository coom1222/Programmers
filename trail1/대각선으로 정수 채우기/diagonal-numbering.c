#include <stdio.h>
#include <string.h>

int main() {
    int N, M;
    int num = 1;
    int rowIdx = 0;
    int colIdx = 0;

    scanf("%d %d", &N, &M);

    int arr[N][M];
    memset(arr, 0, sizeof(arr));

    // 총 처리해야 할 대각선의 갯수는 M+N-1 개
    for(int col = 0; col < M + N - 1; col++){
        colIdx = col;

        if(col > M-1){    
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
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}