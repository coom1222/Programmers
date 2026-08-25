import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();

       int[] arr = new int[n];
       
        for(int i = 0; i < n; i++){
            arr[i] = sc. nextInt();
        }
        
        int count = 0;
        for(int j = 0; j < n; j++){
            if(arr[j]==2){
                count++;
            }

            if(count == 3){
                System.out.printf("%d", j+1);
                break;
            }
        }
    }
}