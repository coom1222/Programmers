import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int n = sc.nextInt();

        arr[0] = 1;
        arr[1] = n;
        int count = 0;
        for(int i = 2; i < 100; i++){
            
            arr[i] = arr[i-1] + arr[i-2];
            count++;
            if(arr[i]>100) {
                break;
            } 
        }

        for(int i = 0; i < count+2; i++){
            System.out.printf("%d ", arr[i]);
        }
        


    }
}