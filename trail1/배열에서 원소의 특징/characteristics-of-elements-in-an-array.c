#include <stdio.h>
#include <stdlib.h>

int main() {
    int* arr = (int*)malloc(sizeof(int)*10);

    for(int i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i < 10; i++){
        if(arr[i] % 3 == 0){
            printf("%d", arr[i-1]);
            break;
        }
    }


    free(arr);
    return 0;
}