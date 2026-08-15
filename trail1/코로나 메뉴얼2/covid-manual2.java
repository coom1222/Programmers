import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count = 0;

    int[] arr = new int[4];

    //for (int i = 0; i < 4; i++) {
        //arr[i] = 0;
    //}

    for(int i = 0; i < 3; i++){
        char isGam = sc.next().charAt(0);
        int temper = sc.nextInt();

        if(isGam == 'Y' && temper >= 37){ arr[0]++; }

        if(isGam == 'N' && temper >= 37){ arr[1]++; }

        if(isGam == 'Y' && temper < 37){ arr[2]++; }

        if(isGam == 'N' && temper < 37){ arr[3]++; }

    }

    for(int i = 0; i < 4; i++){
        System.out.printf("%d ", arr[i]);

        if(i == 3){
            if(arr[0] >= 2){
                System.out.printf("%c", 'E');
            }
        }
        
    }


    }
}