import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, Q;

        N = sc.nextInt();

        Q = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
/*
        for(int s : arr) {
            System.out.print(s + " ");
        }
*/
        for(int i = 0; i < Q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 1, b -> b번째 원소 출력
            if (a == 1){
                System.out.println(arr[b-1]);
            }
            // 2, b -> N개의 원소 중 값이 b를 찾음, 그게 몇 번째 원소인지 출력
            // 여러개라면 가장 index가 작은 것. 없다면 0 출력
            if (a == 2){
                boolean isB = false;
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == b){
                        System.out.println(j+1);
                        isB = true;
                        break;
                    } 
                }
                if (isB == false){
                    System.out.println('0');
                }
            }

            // 3 b e -> b부터 e번째 원소까지 
            // 각 원소의 값을 공백으로 구분하여 차례대로 출력
            if (a == 3){
                int e = sc.nextInt();
                for (int j = b-1; j < e; j++) {
                    System.out.printf(arr[j] + " ");
                }
                System.out.println();
            }
        }
    
        
    }
}