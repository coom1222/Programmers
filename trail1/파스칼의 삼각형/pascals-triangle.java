import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] fibo = new int[N+1][N+1];

        for(int row = 1; row < N+1; row++){
            int col = 0;
            for(int i = 1; i < row+1; i++){
                //printf("row: %d, col: %d ", row, col);
                if(col == 0 || col == row-1) {
                    fibo[row][col] = 1;
                    System.out.printf("%d ", fibo[row][col]);
                } else {
                    fibo[row][col] = fibo[row-1][col-1] + fibo[row-1][col];
                    System.out.printf("%d ", fibo[row][col]);
                }
                col++;
            }
            System.out.printf("\n");
        }
    }
}