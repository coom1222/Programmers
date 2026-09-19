import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumRow = 0;
        int sumCol = 0;
        int sum = 0;
        int[][] arr = new int[4][4];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sumRow += arr[i][j];
            }
            System.out.print(sumRow/4.0 + " ");
            sumRow = 0;
        }
        System.out.println();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                sumCol += arr[j][i];
            }
            System.out.print(sumCol/2.0 + " ");
            sumCol = 0;
        }

        System.out.println();

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
            }
        }
        System.out.printf("%.1f", sum/8.0);
        
    }
}