#include <stdio.h>

int main() {
    int n, sumEven = 0, sumOdd = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d ", &n);

        if((i%2) == 0){
            sumEven += n;
        } else {
            sumOdd += n;
        }
    }
    int result = (sumEven > sumOdd) ? sumEven - sumOdd : sumOdd - sumEven;

    printf("%d", result);

    return 0;
}