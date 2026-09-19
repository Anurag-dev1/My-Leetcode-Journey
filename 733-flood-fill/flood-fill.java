class Solution {
    int n;
    int m;

    public void dfs(int i, int j, int[][] vis,
                    int[][] image, int originalColor, int color) {

        if(i >= n || i < 0 || j >= m || j < 0 ||
           vis[i][j] == 1 ||
           image[i][j] != originalColor) {
            return;
        }

        vis[i][j] = 1;
        image[i][j] = color;

        dfs(i + 1, j, vis, image, originalColor, color);
        dfs(i - 1, j, vis, image, originalColor, color);
        dfs(i, j + 1, vis, image, originalColor, color);
        dfs(i, j - 1, vis, image, originalColor, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        n = image.length;
        m = image[0].length;

        int[][] vis = new int[n][m];

        int originalColor = image[sr][sc];

        if(originalColor == color)
            return image;

        dfs(sr, sc, vis, image, originalColor, color);

        return image;
    }
}