#include <stdio.h>
#include <stdlib.h>

int main() {

    // 0,0 -> 1,0 / 1,1 -> 2,0 / 2,1 / 2,1 -> 3,0 / 3,1 / 3,2 / 3,3 
    int arr[4][4] = {0};
    int sum = 0;
    int index = 0;

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            scanf("%d ", &arr[i][j]);
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            sum += arr[i][j];
            if(index == j){
                index++;
                break;
            }
        }
    }

    printf("%d", sum);

    return 0;
}