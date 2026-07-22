#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int *arr = malloc(10 * sizeof *arr);

    if (arr == NULL) {
        return 1;
    }

    int sum = 0;
    int count = 0;

    for (int i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);

        if (arr[i] == 0) {
            break;
        }

        if (arr[i]%2 == 0) {
            sum += arr[i];
            count++;
        }
    }

    printf("%d %d", count, sum);
    

    free(arr);
    return 0;
}