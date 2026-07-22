#include <stdio.h>

int main() {

    double arr[8];
    double sum = 0;

    for(int i = 0; i < 8; i++){
        scanf("%lf", &arr[i]);
        sum += arr[i];
    }

    printf("%.1f", (double) sum/8);

    return 0;
}