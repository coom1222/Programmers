#include <stdio.h>

int main() {
    
    int n, sum = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d", &n);
        if(i == 2 || i == 4 || i == 9) sum += n;
    }

    printf("%d", sum);
    
    return 0;
}