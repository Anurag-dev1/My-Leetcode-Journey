class Solution {
    int n;
    int[][][] t = new int[2][101][101];

    public int solveForAlice(int[] piles, int person, int i, int M) {
        if (i >= n) {
            return 0;
        }

        if (t[person][i][M] != -1) {
            return t[person][i][M];
        }

        int result = (person == 1) ? -1 : Integer.MAX_VALUE;

        int stones = 0;

        for (int x = 1; x <= (int) Math.min(2 * M, n - i); x++) {
            stones += piles[i + x - 1];

            if (person == 1) {
                result = (int) Math.max(result, stones + solveForAlice(piles, 0, i + x, (int) Math.max(M, x)));
            } else {
                result = (int) Math.min(result, solveForAlice(piles, 1, i + x, (int) Math.max(M, x)));
            }
        }
        return t[person][i][M] = result;
    }

    public int stoneGameII(int[] piles) {
        n = piles.length;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 101; j++) {
                Arrays.fill(t[i][j], -1);
            }
        }

        return solveForAlice(piles, 1, 0, 1);
    }
}