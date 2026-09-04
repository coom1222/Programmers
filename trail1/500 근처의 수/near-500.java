import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] over500 = new int[10];
        int[] under500 = new int[10];

        int maxVal, minVal;

        int n = 0;
        int m = 0;

        // 10개의 정수를 입력받음
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            
            // 500 초과의 수 중 가장 작은 수 출력
            if(arr[i] > 500){
                over500[n] = arr[i];
                n++;
            }

            // 500 미만의 수 중 가장 큰 수를 출력
            if(arr[i] < 500){
                under500[m] = arr[i];
                m++;
            }
        }
/*
        for(int i = 0; i < 10; i++){
            System.out.println("over" + i + ": " + over500[i]);
            System.out.println("under" + i + ": " + under500[i]);
            System.out.println("---");
        }
*/
        minVal = over500[0];
        maxVal = under500[0];

        for(int i = 0; i < 10; i++){
            if(minVal > over500[i] && over500[i] != 0){
                minVal = over500[i];
            }

            if(maxVal < under500[i]){
                maxVal = under500[i];
            }
        }

        System.out.printf("%d %d", maxVal, minVal);

    }
}