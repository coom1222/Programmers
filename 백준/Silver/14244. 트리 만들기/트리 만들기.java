import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n개의 노드
        int n = sc.nextInt();
        // m개의 리프(리프는 차수)
        int m = sc.nextInt();

        // 노드의 개수가 n개일때 간선의 개수 e 는 n-1
        /*
        아 근데 트리고 나발이고 일렬로 연결하면 양 끝은 알아서 리프노드가 되네?
         */
        // 양 끝 0과 (n-m)이 리프 2개
        for (int i = 0; i < m; i++) {
            if (i == 0) System.out.println(1 + " " + 0);
            else System.out.println(1 + " " + (i + 1));
        }

        // 나머지 노드들 체인으로: m+1 ~ n-1
        for (int i = m + 1; i < n; i++) {
            System.out.println((i - 1) + " " + i);
        }

    }
}