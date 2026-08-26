import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        final int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = INT_MIN;
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if (arr[i] > INT_MAX) {
                INT_MAX = arr[i];
            }
        }

        System.out.println(INT_MAX);
    }
}