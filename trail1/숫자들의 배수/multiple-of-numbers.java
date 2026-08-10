import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int loop = 1;

        while(count < 2){
            System.out.printf("%d ", n*loop);
            if (((n*loop) % 5) == 0){
                count++;
            }

            loop++;
        }
    }
}