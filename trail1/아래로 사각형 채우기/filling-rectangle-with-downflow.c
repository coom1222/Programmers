#include <stdio.h>
#include <memory.h>

int main() {
    int N;
    int idx = 1;
    scanf("%d", &N);
    int arr_2d[N][N];
    memset(arr_2d, 0, N * N * sizeof(int));

    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            arr_2d[j][i] = idx;
            idx++; 
        }
    }

    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            printf("%d ", arr_2d[i][j]);
        }
        printf("\n");
    }

    return 0;
}