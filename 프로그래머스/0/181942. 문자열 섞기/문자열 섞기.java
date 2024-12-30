class Solution {
    public String solution(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();


        int maxLength = ((charArray1.length > charArray2.length) ? charArray1.length : charArray2.length);
        String answer = "";

        for (int i = 0; i < maxLength; i++) {
            if (i < charArray1.length) {
               answer = answer + charArray1[i];
            }
            if (i < charArray2.length) {
                answer += charArray2[i];
            }
        }

        return answer;
    }

  
}


