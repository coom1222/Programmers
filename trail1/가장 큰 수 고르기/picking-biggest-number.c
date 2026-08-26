
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main() {

    int *arr = malloc(sizeof(int)*10);
    int max_val = INT_MIN;


    for (int i = 0; i < 10; i++) {
        scanf("%d ", &arr[i]);
    }


    for (int i = 0; i < 10; i++) {
        if (arr[i] > max_val) {
            max_val = arr[i];
        }
    }

    printf("%d", max_val);
    free(arr);
    return 0;

}
