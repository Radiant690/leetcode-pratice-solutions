//        ? What we can do here is, to count increment the value of result if the following are present in the right hand side and decrement the result if found in the left hand side.
//        Finally we will output the result after checking it == 0, claiming that it is aligned.

class Solution {
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int l = s.length() / 2, cnt_half = 0, cnt_another_half = 0;
        for (int i = 0, j = l; i < l && j < s.length(); i++, j++) {
            if(isVowel(s.charAt(i))) cnt_half++;
            if(isVowel(s.charAt(j))) cnt_another_half++;
        }
        return cnt_another_half == cnt_half;
    }
}