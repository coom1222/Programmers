import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] price = new int[N];
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        ArrayList<Integer> profit_arr = new ArrayList<>();
        int idx = 0;

        for(int i = 0; i < N; i++){
            price[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(price[i] < min_value){
                min_value = price[i];
                idx = i;
            }
            for(int j = idx; j < N; j++){
                if(price[j] > max_value){
                    max_value = price[j];
                }
            }
            //System.out.println("max - min: " + max_value + " - " + min_value);
            int profit = max_value - min_value;
            profit_arr.add(profit);

            max_value = Integer.MIN_VALUE;
            min_value = Integer.MAX_VALUE;
        }

        // for(int i = idx; i < N; i++){
        //     if(price[i] > max_value){
        //         max_value = price[i];
        //     }
        // }

        for(int i = 0; i < profit_arr.size(); i++){
            if(profit_arr.get(i) > max_value){
                max_value = profit_arr.get(i);
            }
        }

        //System.out.println(profit_arr);
        System.out.println(max_value);
    }
}