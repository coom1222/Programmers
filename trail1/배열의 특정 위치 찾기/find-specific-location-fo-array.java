import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(((i+1) % 3)==0){
                avg += arr[i];
            }
            if(((i+1) % 2)==0) {
                sum += arr[i];
            }
        }

        System.out.printf("%d %.1f", sum, (double) avg / 3);
    }  
}