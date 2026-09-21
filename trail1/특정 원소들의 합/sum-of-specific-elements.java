import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0,0 -> 1,0 / 1,1 -> 2,0 / 2,1 / 2,1 -> 3,0 / 3,1 / 3,2 / 3,3 
        int[][] arr = new int[4][4];
        int sum = 0;
        int index = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum += arr[i][j];
                if(index == j){
                    index++;
                    break;
                }
            }
        }

        System.out.printf("%d", sum);

    }
}