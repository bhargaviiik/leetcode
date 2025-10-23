class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder str = new StringBuilder(s);

        // Keep reducing until only 2 digits remain
        while (str.length() > 2) {
            StringBuilder newS = new StringBuilder();

            // Compute new digits = (sum of adjacent digits) % 10
            for (int i = 0; i < str.length() - 1; i++) {
                int a = str.charAt(i) - '0';
                int b = str.charAt(i + 1) - '0';
                newS.append((a + b) % 10);
            }

            str = newS; // replace s with new string
        }

        // Now str has exactly 2 digits
        return str.charAt(0) == str.charAt(1);
    }
}