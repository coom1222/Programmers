#include <stdio.h>
#include <stdlib.h>

int main() {
    int n = 0;
    scanf("%d", &n);

    double *arr = malloc(sizeof(double) *n);
    double sum= 0;

    for(int i = 0; i < n; i++){
        scanf("%lf", &arr[i]);
        sum += arr[i];
    }

    double avg = sum / n;

    printf("%.1lf\n", avg);
    if (avg >= 4.0) {
        printf("Perfect\n");
    } else if (avg >= 3.0) {
        printf("Good\n");
    } else {
        printf("Poor\n");
    }

    free(arr);
    return 0;
}