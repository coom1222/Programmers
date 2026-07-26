#include <stdio.h>
#include <stdlib.h>

int main() {
    char *arr = (char*)malloc(sizeof(char)*10);
    char ch;

    for(int i = 0; i < 10; i++){
        scanf("%c ", &ch);

        if((i == 1) || (i == 4) || (i == 7)){
            printf("%c ", ch);
        }
    }

    return 0;
}