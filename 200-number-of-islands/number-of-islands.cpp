class Solution {
public:
    int n;
    int m;

    void bfs(int row, int col, vector<vector<int>>& vis,
             vector<vector<char>>& grid) {

        vis[row][col] = 1;
        queue<pair<int,int>> Q;
        Q.push({row, col});

        while(!Q.empty()) {

            int row = Q.front().first;
            int col = Q.front().second;

            Q.pop();

            int delrow[] = {-1, 1, 0, 0};
            int delcol[] = {0, 0, -1, 1};

            for(int k = 0; k < 4; k++) {

                int nrow = row + delrow[k];
                int ncol = col + delcol[k];

                if(nrow >= 0 && ncol >= 0 &&
                   nrow < n && ncol < m &&
                   grid[nrow][ncol] == '1' &&
                   !vis[nrow][ncol]) {

                    vis[nrow][ncol] = 1;
                    Q.push({nrow, ncol});
                }
            }
        }
    }

    int numIslands(vector<vector<char>>& grid) {

        n = grid.size();
        m = grid[0].size();

        int count = 0;

        vector<vector<int>> vis(n, vector<int>(m, 0));

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {

                if(!vis[row][col] && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }

        return count;
    }
};