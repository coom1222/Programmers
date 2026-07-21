#include <stdio.h>

int main() {
    int arr[10] = {0};

    int sum = 0;
    int count = 0;
    double avg = 0;
        
    for(int i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
        if (arr[i] >= 250) break;
        sum += arr[i];
        count++;
    }
    avg = (double)sum / count;
    printf("%d ", sum);
    printf("%.1f", avg);
    return 0;
}