#include <stdio.h>
#include <stdlib.h>

int main() {

    int *arr = malloc(10 * sizeof(int));
    int sum = 0;
    double avg = 0;
    int count = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d", &arr[i]);

        if(arr[i] == 0) {break;}

        sum += arr[i];
        count++;
    }

    avg = (double) sum / count;

    printf("%d %.1f", sum, avg);

    return 0;
}