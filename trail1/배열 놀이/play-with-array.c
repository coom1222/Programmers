#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int main() {
    int N, Q;
    int a, b;

    // scanf 뒤의 공백들을 제거하여 버퍼 오류를 방지합니다.
    if (scanf("%d %d", &N, &Q) != 2) return 0;

    int *arr = (int *)calloc(N, sizeof(int));

    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < Q; i++) {
        scanf("%d", &a);

        // 1번과 2번 질의는 뒤에 숫자가 1개(b)만 더 옵니다.
        // 3번 질의는 뒤에 숫자가 2개(s, e)가 옵니다. 문제의 s를 편의상 b로 받습니다.
        scanf("%d", &b); 

        // 1. b번째 원소 출력
        if (a == 1) {
            printf("%d\n", arr[b - 1]);
        }
        
        // 2. 값이 b인 원소의 인덱스 출력
        if (a == 2) {
            bool isB = false;
            for (int j = 0; j < N; j++) {
                if (arr[j] == b) {
                    printf("%d\n", j + 1);
                    isB = true;
                    break;
                }
            }
            if (isB == false) {
                printf("0\n"); // 여기에 줄바꿈(\n)이 빠졌던 것을 수정했습니다.
            }
        }

        // 3. b(문제의 s)부터 e번째 원소까지 출력
        if (a == 3) {
            int e;
            scanf("%d", &e); // 끝 인덱스 e를 추가로 입력받음
            for (int j = b - 1; j < e; j++) {
                printf("%d ", arr[j]);
            }
            printf("\n"); // 한 줄 출력이 끝나면 줄바꿈
        }
    }

    free(arr);
    return 0;
}
