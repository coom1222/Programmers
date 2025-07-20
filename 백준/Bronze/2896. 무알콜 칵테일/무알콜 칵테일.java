import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 구매한 주스의 양 입력 ex) 9 9 9
        int A = scanner.nextInt(); // 오렌지
        int B = scanner.nextInt(); // 사과
        int C = scanner.nextInt(); // 파인애플

        // 칵테일 비율 입력 ex) 3 : 2 : 1
        int I = scanner.nextInt(); // 오렌지 비율
        int J = scanner.nextInt(); // 사과 비율
        int K = scanner.nextInt(); // 파인애플 비율

        // 각 주스로 만들 수 있는 칵테일의 개수 중 가장 작은 값을 구함
        // 예시를 따르면, 오렌지 3개, 사과 4.5개, 파일애플 9개 이므로 3개만 만들 수 있다.
        double 최대칵테일갯수 = Math.min(Math.min((double)A / I, (double)B / J), (double)C / K);

        // 사용된 주스의 양 계산
        double usedOrange = 최대칵테일갯수 * I;
        double usedApple = 최대칵테일갯수 * J;
        double usedPineapple = 최대칵테일갯수 * K;

        // 남은 주스의 양
        double remainedOrange = A - usedOrange;
        double remainedApple = B - usedApple;
        double remainedPineapple = C - usedPineapple;

        // 결과 출력, 소수점 6자리까지
        System.out.println(remainedOrange + " " + remainedApple + " " + remainedPineapple);

        scanner.close();

    }
}