#include <stdio.h>
#include <stdlib.h>

int main() {

    int N;
    scanf("%d", &N);

    int* arr = (int*)malloc(sizeof(int)*N);

    for(int i = 0; i < N; i++){
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i < N; i++){
        int sqr = arr[i] * arr[i];
        printf("%d ", sqr);
    }

    free(arr);
    return 0;
}