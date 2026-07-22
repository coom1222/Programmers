#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int *arr = (int *)malloc(10*sizeof(int));

    int count = 0;
     for(int i = 0; i < 10; i++){
       scanf("%d", &arr[i]);
       
       if (arr[i] == 0) break;
       
       count++;
       }

    for(int i = count-1; i >= 0; i--){
        printf("%d ", arr[i]);
    }
    free(arr);
    return 0;
}