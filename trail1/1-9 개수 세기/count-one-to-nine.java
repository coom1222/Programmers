import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] arr2 = new int[9];

        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            arr2[m-1]++;
        }

        for(int i = 0; i < 9; i++){
            System.out.println(arr2[i]);
        }
    }
}