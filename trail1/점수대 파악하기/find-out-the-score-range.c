#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int*)malloc(sizeof(int)*100);
   
    int n = -1;
    int count = 0;

    while(1){
        scanf("%d ", &n);

        int sip = n / 10;
        arr[sip]++;
        count++;

        if(n==0) {break;}
    }
    
    for(int i = 10; i > 0; i--){
        printf("%d - %d\n", (i)*10, arr[i]);
    }

    free(arr);

    return 0;
}