#include <stdio.h>

int main() {
    int val;
    int sum_val = 0;
    int arr[10];
    for(int i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
        sum_val += arr[i];
    }

    printf("%d", sum_val);

    return 0;
}