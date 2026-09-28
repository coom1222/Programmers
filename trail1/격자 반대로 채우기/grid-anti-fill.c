#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isOdd(int n){
    return (n % 2 != 0);
    // if(n % 2 == 0){
    //     return false;
    // } else {
    //     return true;
    // }
}

int main() {
    
    int N;
    int idx = 1;

    scanf("%d", &N);

    int arr[N][N];
    memset(arr, 0, N * N * sizeof(int));

    for(int col = N-1; col >= 0; col--){
        if(isOdd(N)){
            if(col % 2 != 0){
                for(int row = 0; row < N; row++){
                    arr[row][col] = idx;
                    idx++;
                }
            } else {
                for(int row = N-1; row >= 0; row--){
                    arr[row][col] = idx;
                    idx++;
                }
            }

        } else {
            if(col % 2 == 0){
                for(int row = 0; row < N; row++){
                    arr[row][col] = idx;
                    idx++;
                }
            } else {
                for(int row = N-1; row >= 0; row--){
                    arr[row][col] = idx;
                    idx++;
                }
            }
        }
    }

    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            printf("%d ", arr[i][j]);
            
        }
       printf("\n");
    }

    return 0;
}

