#include <stdio.h>
#include <stdlib.h>

int main() {

    int A, B;
    int sum = 0;

    scanf("%d %d", &A, &B);

    int *arr = (int*)malloc(sizeof(int)*B);

    while(A > 1){
        int mod = A % B;
        A = A / B;

        arr[mod]++;
        //printf("%d ", mod);
        //printf("%d \n", A);
    }

    for(int i = 0; i < B; i++){
        int sqr = arr[i]*arr[i];
        sum += sqr;
    }

    printf("%d", sum);

    free(arr);

    return 0;
}