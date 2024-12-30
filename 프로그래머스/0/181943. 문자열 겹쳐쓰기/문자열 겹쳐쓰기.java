class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] charArray = my_string.toCharArray();
        char[] overwriteCharArray = overwrite_string.toCharArray();

        for(int i = 0; i < overwrite_string.length(); i++) {
            charArray[s+i] = overwriteCharArray[i];
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Program29b8UYP", "merS123", 7));

    }
}