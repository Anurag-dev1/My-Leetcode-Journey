class Solution {
public:
    int n;
    int m;

    void dfs(int i , int j , vector<vector<int>> &vis , vector<vector<char>> &grid){
        if(i >= n || i < 0 || j >= m || j < 0 || vis[i][j] || grid[i][j] != '1'){
            return ;
        }

        vis[i][j] = true;

        dfs(i+1 , j , vis , grid);
        dfs(i-1 , j , vis , grid);
        dfs(i , j+1 , vis , grid);
        dfs(i , j-1 , vis , grid);
    }

    int numIslands(vector<vector<char>>& grid) {

        n = grid.size();
        m = grid[0].size();

        int count = 0;

        vector<vector<int>> vis(n, vector<int>(m, 0));

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {

                if(!vis[row][col] && grid[row][col] == '1') {
                    dfs(row, col, vis, grid);
                    count++;
                }
            }
        }

        return count;
    }
};