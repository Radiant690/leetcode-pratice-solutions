class Solution {
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int l = s.length() / 2, cnt_half = 0, cnt_another_half = 0;
//        ? What we can do here is, to count increment the value of result if the following are present in the right hand side and the result if found in the left hand side.
//        ** Here we return result if result of cnt_half == cnt_another_half
        for (int i = 0, j = l; i < l && j < s.length(); i++, j++) {
            if(isVowel(s.charAt(i))) cnt_half++;
            if(isVowel(s.charAt(j))) cnt_another_half++;
        }
        return cnt_another_half == cnt_half;

//        Same can be done instead by incrementing result in right side of string and decrementing in the left side
//        Now simply return true if result == 0
//
//        int answer = 0;
//        for (int i = 0, j = l; i < l; i++, j++) {
//            if(isVowel(s.charAt(i))) answer++;
//            if(isVowel(s.charAt(j))) answer--;
//        }


    }
}