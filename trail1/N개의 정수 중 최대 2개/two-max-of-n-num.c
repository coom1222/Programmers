#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main() {
    int N;

    scanf("%d ", &N);

    int *arr = calloc(N, sizeof(int));
    
    for(int i = 0; i < N; i++){
        scanf("%d ", &arr[i]);
    }
/*
    for(int num2 = 0; num2 < N; num2++){
        printf("%d ", arr[num2]);
    }
    printf("\n");
*/
    for(int k = 0; k < N-1; k++){
        for(int j = 0; j < N-k-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
/*
    for(int num = 0; num < N; num++){
        printf("%d ", arr[num]);
    }
*/
    printf("%d %d", arr[N-1], arr[N-2]);
    return 0;
}