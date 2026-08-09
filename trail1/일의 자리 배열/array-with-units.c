#include <stdio.h>

int main() {
    int arr[10];

    int n1, n2;

    scanf("%d", &n1);
    scanf("%d", &n2);

    arr[0] = n1;
    arr[1] = n2;

    for(int i = 2; i < 10; i++){
        arr[i] = arr[i-1] + arr[i-2];
        if(arr[i] >= 10){
            arr[i] = arr[i] - 10;
        }
    }

    for(int i = 0; i < 10; i++){
        printf("%d ", arr[i]);
    }

    return 0;
}