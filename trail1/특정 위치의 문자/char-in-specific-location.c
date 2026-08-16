#include <stdio.h>

int main() {

        char word[6] = { 'L', 'E', 'B', 'R', 'O', 'S' };

        // 해당 문자를 찾지 못했다면 -1
        int idx = -1;

        char ch;
        scanf("%c ", &ch);

        // 문자 탐색
        for (int i = 0; i < 6; i++) {
            if (word[i] == ch) {
                idx = i;
            }
        }

        // 문자가 존재하지 않는 경우
        if (idx == -1) {
            printf("None");
        }
        else {
            printf("%d", idx);
        }

    return 0;
}