#include <memory.h>
#include <stdio.h>

int main() {
    int n,m;
    int num = 1;

    scanf("%d ", &n);
    scanf("%d ", &m);

    int arr[n][m];
    memset(arr, 0, n * m * sizeof(int));

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            arr[i][j] = num;
            num++;
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}