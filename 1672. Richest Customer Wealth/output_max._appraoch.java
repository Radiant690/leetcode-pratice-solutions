class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max = -1;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + accounts[i][j];
                // if (sum >= max) {
                //     max = sum;
                // }
                max = Integer.max(max, sum);
            }
        }
        return max;
    }
}