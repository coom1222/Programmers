#include <stdio.h>
#include <string.h>

int main() {
    int N = 0;
    scanf("%d", &N);

    int fibo[N+1][N+1];
    memset(fibo, 0, (N+1)*(N+1)*sizeof(int));

    

    for(int row = 1; row < N+1; row++){
        int col = 0;
        for(int i = 1; i < row+1; i++){
            //printf("row: %d, col: %d ", row, col);
            if(col == 0 || col == row-1) {
                fibo[row][col] = 1;
                printf("%d ", fibo[row][col]);
            } else {
                fibo[row][col] = fibo[row-1][col-1] + fibo[row-1][col];
                printf("%d ", fibo[row][col]);
            }
            col++;
        }
        printf("\n");
    }
    return 0;
}