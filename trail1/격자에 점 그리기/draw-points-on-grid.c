#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, M;

    scanf("%d %d", &N, &M);
    int idx = 1;

    int r, c = 0;
    // calloc()는 int *를 3개 저장할 수 있는 공간을 확보
    int **arr = calloc(N, sizeof(int*));

    // 정수 3*N개를 저장할 공간 확보
    // arr[0] = calloc(3, sizeof(int));
    // arr[1] = calloc(3, sizeof(int));
    // arr[2] = calloc(3, sizeof(int));
    for (int i = 0; i < N; i++) {
        arr[i] = calloc(N, sizeof(int));
    }

    for (int i = 0; i < M; i++) {
        int r, c;
        scanf("%d %d", &r, &c);

        arr[r-1][c-1] = idx;
            idx++;
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}