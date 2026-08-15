#include <stdio.h>
#include <stdlib.h>

int main() {

    char isGam;
    int temper;
    int count = 0;

    int *arr = (int*)malloc(sizeof(int)*4);

    for (int i = 0; i < 4; i++) {
        arr[i] = 0;
    }

    for(int i = 0; i < 3; i++){
        scanf(" %c", &isGam);
        scanf("%d ", &temper);

        
        if(isGam == 'Y' && temper >= 37){ arr[0]++; }

        if(isGam == 'N' && temper >= 37){ arr[1]++; }

        if(isGam == 'Y' && temper < 37){ arr[2]++; }

        if(isGam == 'N' && temper < 37){ arr[3]++; }

    }

    for(int i = 0; i < 4; i++){
        printf("%d ", arr[i]);

        if(i == 3){
            if(arr[0] >= 2){
                printf("%c", 'E');
            }
        }
        
    }

    free(arr);

    return 0;
}