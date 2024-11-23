import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        String string = sc.nextLine();

        // Character.isUpperCase() -> 문자 값이 대문자인지 확인
        // Character.isLowerCase() -> 문자 값이 대문자인지 확인
        // Character.toUpperCase() -> 문자 값을 대문자로 변환
        // Character.toLowerCase() -> 문자 값을 대문자로 변환
        for (int i = 0; i < string.length(); i++) {
            char munjaHana = string.charAt(i);

            if (Character.isUpperCase(munjaHana)) {
                answer.append(Character.toLowerCase(munjaHana));
            } else if(Character.isLowerCase(munjaHana)) {
                answer.append(Character.toUpperCase(munjaHana));
            }

        }
        System.out.println(answer);
    }
}