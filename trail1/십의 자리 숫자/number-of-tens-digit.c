#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(sizeof(int)*100);
    int n = -1;
    int count = 0;

    while(n != 0){
        scanf("%d ", &n);
        int sip = n / 10;
        arr[sip]++;
        count++;
    }
    
    for(int i = 0; i < 9; i++){
        printf("%d - %d\n", i+1, arr[i+1]);
    }


    free(arr);

    return 0;
}