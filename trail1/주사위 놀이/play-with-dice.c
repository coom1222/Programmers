#include <stdio.h>
#include <stdlib.h>

int main() {
        int* count = (int*)malloc(sizeof(int)*10);

        for(int i = 0; i < 10; i++){
            int n;
            scanf("%d", &n);
            count[n]++;
        }
        
        for(int i = 0; i < 6; i++){
            printf("%d - %d\n", i+1, count[i+1]);
        }
        free(count);
    return 0;
}