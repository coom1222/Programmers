#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
    int N1, N2;

    if (scanf("%d %d", &N1, &N2) != 2) return 0;
    
    int *arr_A = malloc(sizeof(int) * N1);
    int *arr_B = malloc(sizeof(int) * N2);

    for(int i = 0; i < N1; i++){
        scanf("%d", &arr_A[i]); // 💡 &와 [i]를 정확히 명시
    }

    for(int i = 0; i < N2; i++){
        scanf("%d", &arr_B[i]); // 💡 &와 [i]를 정확히 명시
    }

    bool is_match = false;

    // A 배열을 돌면서 B 배열 전체가 포함되는 구간이 있는지 찾습니다.
    // 인덱스 초과를 막기 위해 루프 범위를 N1 - N2까지만 제한합니다.
    for(int j = 0; j <= N1 - N2; j++){
        bool current_match = true;
        
        // 현재 위치(j)부터 B 배열의 크기만큼 하나씩 비교합니다.
        for(int k = 0; k < N2; k++){
            if(arr_A[j + k] != arr_B[k]){
                current_match = false;
                break;
            }
        }
        
        // 일치하는 구간을 찾았다면 성공 표시 후 중단합니다.
        if(current_match){
            is_match = true;
            break;
        }
    }

    // 💡 삼항 연산자는 이렇게 전체 결과를 한 번만 출력할 때 쓰면 깔끔합니다.
    is_match ? printf("Yes\n") : printf("No\n");

    free(arr_A);
    free(arr_B);
    return 0;
}
