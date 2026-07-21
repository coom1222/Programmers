import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int sum = 0;
        int count = 0;
        double avg = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if (arr[i] >= 250) break;
            sum += arr[i];
            count++;
        }
        avg = (double)sum / count;
        System.out.printf("%d ", sum);
        System.out.printf("%.1f", avg);


    }
}