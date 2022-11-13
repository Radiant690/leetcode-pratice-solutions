class Solution {
    public int findNumbers(int[] nums) {
        int sol = 0;
        for (int n : nums) // Iterate over each number
            if (getNumberOfDigits(n) % 2 == 0) // Call getNumberOfDigits which return the total number of digits in the number
                sol++; // if even number of digits are returned we increment sol by 1
        return sol;
    }

    public int getNumberOfDigits(int num) {
        int count = 1; // Initialise count to 1, not 0 cause we are dividing num/10 in while loop
        while ((num /= 10) != 0) // Iterate until number is 0
            count++; // Increment count until number is 0
        return count;
    }
}

// 
// ! Here we are using while loop to count the digits which is inefficient, better approach is to use optimized way by lograthimic.