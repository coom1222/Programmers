class Solution {
    boolean solution(String s) {
        int Pcount = 0;
        int Ycount = 0;
        
        StringBuilder sb = new StringBuilder(String.valueOf(s));
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'p' || sb.charAt(i) == 'P'){
                Pcount++;
            } else if (sb.charAt(i) == 'y' || sb.charAt(i) == 'Y') {
                Ycount++;
            }
        }
        
        if (Pcount == Ycount) {
            return true;
        }
        
        
        if (Pcount != Ycount) {
            return false;
        }

        if (Pcount == 0 && Ycount == 0) {
            return true;
        }
        return true;
    }
}