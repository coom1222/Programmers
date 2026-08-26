#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main() {
    int N;
    scanf("%d ", &N);
    int *arr = malloc(sizeof(int)*N);
    int count = 0;
    int min_val = INT_MAX;

    for(int i = 0; i < N; i++){
        scanf("%d ", &arr[i]);
    }


    for(int i = 0; i < N; i++){
        if(min_val > arr[i]){
            min_val = arr[i];
        }
    }
    //printf("%d ", min_val);

    for(int i = 0; i < N; i++){
        if(min_val == arr[i]){
            count++;
        }
    }

    printf("%d %d", min_val ,count);
    free(arr);
    return 0;
}