class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;

        // Step 1: Apply gravity
        for (int i = 0; i < n; i++) {
            int empty = m - 1; // position where next stone should go
            
            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1; // reset after obstacle
                } 
                else if (box[i][j] == '#') {
                    char temp = box[i][j];
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    empty--;
                }
            }
        }

        // Step 2: Rotate 90° clockwise
        char[][] ans = new char[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n - 1 - i] = box[i][j];
            }
        }

        return ans;
    }
}