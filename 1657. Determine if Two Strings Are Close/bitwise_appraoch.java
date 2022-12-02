class Solution {
    public boolean closeStrings(String word1, String word2) {
        /* The part where we have to count the frequency of characters is simple. The real problem was finding a way to check if a given frequency in the frequency array of second string occurs anywhere in the frequency array of the first string. HashSets can be used for that but where is the fun in that. To solve this problem I used xor operation. Now, the xor gives 1 only if number of 1s in the input are 1. So if the xor operation ever encounter a condition when the number of 1s is odd, it will stay 1 until it is cancelled out in future by another same number. Suppose you encounter a frequency 5 in frequency array 1, it can only be cancelled out by another frequency 5 only. You can take 2 separate variables to calculate xor of all the frequencies in two strings separately and perform an xor of both the variables at last. But this will be same as having a single variable. A base case is if frequency of a character is zero in one string but not in another, then of course answer is false. */
        if(word1.length()!=word2.length())
            return false;

        int []d1=new int[26];
        int []d2=new int[26];

        // getting freq of each character
        for(int i=0;i<word1.length();i++) {
            char c=word1.charAt(i);
            d1[c-'a']++;
        }

        for(int i=0;i<word2.length();i++) {
            char c=word2.charAt(i);
            d2[c-'a']++;
        }

        int res=0;

        // performing xor operation
        for(int i=0;i<26;i++) {
            if((d1[i]==0 && d2[i]!=0) || (d2[i]==0 && d1[i]!=0))
                return false;
            res^=d1[i];
            res^=d2[i];
        }
        return res==0;
    }
}