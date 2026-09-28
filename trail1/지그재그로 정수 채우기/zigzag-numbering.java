import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int idx = 0;

        int[][] arr = new int[N][M];

        for(int col = 0; col < M; col++){
            if(col % 2 == 0){
                for(int row = 0; row < N; row++){
                    arr[row][col] = idx;
                    idx++;
                }        
            } else {
                for(int row = N-1; row >=0; row--){
                    arr[row][col] = idx;
                    idx++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        
    }
}