import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt(); // 테스트 케이스의 개수

        for (int i = 1; i <= testCase; i++) {
            int n = scanner.nextInt();
            int maxValue = n; // 최대값을 저장하기 위한 변수

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2; // n이 짝수일 때
                } else {
                    n = (n * 3) + 1; // n이 홀수일 때
                }
                if (n > maxValue) {
                    maxValue = n; // 새로운 최대값이 발견되면 업데이트
                }
            }
            System.out.println(maxValue);
        }

        scanner.close();
    }
}
