import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            count[n]++;
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println(i+1 + " - " + count[i+1]);
        }
        
    }
}