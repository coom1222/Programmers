#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    int *arr = (int*)malloc(10*sizeof(int));

    int sum = 0;
    double avg = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
        if(((i+1) % 3)==0){
            avg += arr[i];
        }
        if(((i+1) % 2)==0) {
            sum += arr[i];
        }
    }

    printf("%d %.1f", sum, (double) avg / 3);

    free(arr);
    return 0;
}