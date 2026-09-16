class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    private void bfs(int i, int j, int[][] vis, char[][] grid) {

        vis[i][j] = 1;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));

        int n = grid.length;
        int m = grid[0].length;

        int[] delrow = {-1, 1, 0, 0};
        int[] delcol = {0, 0, -1, 1};

        while(!q.isEmpty()) {

            int row = q.peek().first;
            int col = q.peek().second;

            q.poll();

            for(int k = 0; k < 4; k++) {

                int nrow = row + delrow[k];
                int ncol = col + delcol[k];

                if(nrow >= 0 && nrow < n &&
                   ncol >= 0 && ncol < m &&
                   grid[nrow][ncol] == '1' &&
                   vis[nrow][ncol] == 0) {

                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count = 0;

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {

                if(vis[row][col] == 0 && grid[row][col] == '1') {

                    count++;

                    bfs(row, col, vis, grid);
                }
            }
        }

        return count;
    }
}