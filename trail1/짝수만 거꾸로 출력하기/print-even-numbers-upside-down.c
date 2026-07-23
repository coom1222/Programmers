#include <stdio.h>
#include <stdlib.h>

int main() {

    int n = 0;
        
    scanf("%d", &n);
    int *arr = (int*)malloc(sizeof(int)*n);

    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    for(int i = n-1; i >= 0; i--) {
        if(arr[i]%2 == 0){
            printf("%d ", arr[i]);
        }
    }
    free(arr);
    return 0;
}