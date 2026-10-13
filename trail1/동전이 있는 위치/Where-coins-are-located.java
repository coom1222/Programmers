import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exists = false;
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][N];

        for(int i = 0; i < M; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r-1][c-1] = 1;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}