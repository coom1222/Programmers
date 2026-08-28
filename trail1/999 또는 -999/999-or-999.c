#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main() {
    int *arr = calloc(100, sizeof(int));

    int maxVal = INT_MIN;
    int minVal = INT_MAX;

    for(int i = 0; i < 100; i++){
        scanf("%d ", &arr[i]);

        if(arr[i] == 999 || arr[i] == -999){
            break;
        }

        if(arr[i] > maxVal){
            maxVal = arr[i];
        }

        if(arr[i] < minVal){
            minVal = arr[i];
        }
    }

    printf("%d %d", maxVal, minVal);

    free(arr);
    return 0;
}