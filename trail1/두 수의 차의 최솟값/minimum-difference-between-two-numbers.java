import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min_value = 0;
        int[] arr = new int[N];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N-1; i++){
            int min = arr[i+1] - arr[i];
            result.add(min);
            //System.out.println(result.get(i));
        }

        min_value = result.get(0);

        for(int i = 0; i < result.size(); i++){
            if(min_value > result.get(i)){
                min_value = result.get(i);
         //       System.out.println("min_value: " + min_value);
            }
        }

        System.out.println(min_value);

    }
}