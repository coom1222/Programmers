#include <stdio.h>
#include <stdlib.h>

int main() {

    int n;
    
    scanf("%d ", &n);

    int* arr = malloc(sizeof(int)*n);

    for(int i = 0; i < n; i++){
        scanf("%d ", &arr[i]);
    }

    int count = 0;
    for(int j = 0; j < n; j++){
        if(arr[j]==2){
            count++;
        }

        if(count == 3){
            printf("%d", j+1);
            break;
        }
    }

    free(arr);
    return 0;
}