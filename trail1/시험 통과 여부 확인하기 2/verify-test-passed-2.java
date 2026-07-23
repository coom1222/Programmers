import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][4];

        int[] sum = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
                sum[i] += arr[i][j];
            }

            if (sum[i]/4 >= 60) {
                //System.out.printf("%d", sum[i]/4);
                System.out.println("pass");
                count++;
            } else {
                //System.out.printf("%d", sum[i]/4);
                System.out.println("fail");
            }
        }
        System.out.printf("%d", count);

    }
}