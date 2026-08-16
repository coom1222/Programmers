#include <stdio.h>
#include <stdlib.h>

int main() {

    int N, M;

    scanf("%d %d ", &N, &M);

    int* arr = malloc(sizeof(int)*N);

    int cnt = 0;

    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < N; i++) {
        if (arr[i] == M) {
            cnt++;
        }
    }

    printf("%d", cnt);

    free(arr);

    return 0;

}