

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 악보의 수
        int Q = scanner.nextInt(); // 질문의 수
        int[] sum = new int[N]; // 각 악보의 길이 합 저장 배열
        int[] indexes = new int[Q]; // 각 질문에 대한 인덱스 저장 배열

        for (int i = 0; i < N; i++) {
            int time = scanner.nextInt(); // 각 악보의 길이
            sum[i] = time + (i ==0 ? 0 : sum[i-1]); // 누적 합 계산
        }

        // 알고자 하는 시간
        for (int i = 0; i < Q; i++) {
            indexes[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int time = indexes[i];
            if (time == 0) {
                System.out.println(1);
                continue;
            }
            for (int j = 0; j < N; j++) {
                if (time < sum[j]) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }

    }
}
