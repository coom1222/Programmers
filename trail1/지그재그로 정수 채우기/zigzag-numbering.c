#include <stdio.h>
#include <memory.h>

int main() {
    int N, M;
    int idx = 0;

    scanf("%d %d", &N, &M);

    int arr[N][M];

    memset(arr, 0, N * M * sizeof(int));
    
    for(int col = 0; col < M; col++){
        if(col%2==0){
            for(int row = 0; row < N; row++){
                arr[row][col] = idx;
                idx++;
            }
        } else {
            for(int row = N-1; row >= 0; row--){
                arr[row][col] = idx;
                idx++;
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