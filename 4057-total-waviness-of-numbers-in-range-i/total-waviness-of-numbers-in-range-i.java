class Solution {
    private int digit(int n) {
        String s = Integer.toString(n);
        int l = s.length();

        if (l < 3) {
            return 0;
        }
        int score = 0;
        for (int i = 1; i <= l - 2; i++) {
            if (s.charAt(i) > s.charAt(i + 1) && s.charAt(i) > s.charAt(i - 1))
                score++;
            if (s.charAt(i) < s.charAt(i + 1) && s.charAt(i) < s.charAt(i - 1))
                score++;
        }
        return score++;
    }

    public int totalWaviness(int num1, int num2) {
        int score = 0;

        for (int i = num1; i <= num2; i++) {
            score += digit(i);
        }
        return score;
    }
}