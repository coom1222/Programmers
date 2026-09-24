#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

/*
int main() {
    int n,m;
    int num = 1;

    scanf("%d ", &n);
    scanf("%d ", &m);

    int arr[n][m];
    memset(arr, 0, n * m * sizeof(int));
    */
int main() {
    int N, M;

    scanf("%d %d", &N, &M);
    
    int arr1[N][M];
    int arr2[N][M];
    int result[N][M];

    memset(arr1, 0, N * M * sizeof(int));
    memset(arr2, 0, N * M * sizeof(int));
    memset(result, 0, N * M * sizeof(int));

    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            scanf("%d ", &arr1[i][j]);
        }
    }

    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            scanf("%d ", &arr2[i][j]);
        }
    }

    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            result[i][j] = arr1[i][j] == arr2[i][j] ? 0 : 1;
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }

    return 0;
}