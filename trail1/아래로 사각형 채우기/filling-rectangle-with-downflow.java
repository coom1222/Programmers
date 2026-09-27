import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int idx = 1;
        
        int[][] arr_2d = new int[N][N];
    
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr_2d[j][i] = idx;
                idx++; 
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%d ", arr_2d[i][j]);
            }
            System.out.println();
        }
    }
}