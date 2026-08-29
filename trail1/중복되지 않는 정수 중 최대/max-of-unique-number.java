import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            count.merge(arr[i], 1, Integer::sum);   // 등장 횟수 누적
        }

        int ans = -1;
        for (int v : arr) {
            if (count.get(v) == 1) ans = Math.max(ans, v);  // 딱 1번 나온 값만
        }
        System.out.println(ans);
    }
}