import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                arr[row][0] = 1;
                arr[0][col] = 1;
            }
        }

        for (int row = 1; row < N; row++) {
            for (int col = 1; col < N; col++) {
                arr[row][col] = arr[row][col-1] + arr[row-1][col] + arr[row-1][col-1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}