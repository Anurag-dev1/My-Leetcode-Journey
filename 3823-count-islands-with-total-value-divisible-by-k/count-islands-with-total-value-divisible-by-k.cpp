class Solution {
public:
    int m;
    int n;
    vector<vector<int>> dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    long long dfs(int i, int j, vector<vector<int>>& grid) {
        long long sum = grid[i][j];
        grid[i][j] = 0;

        for (vector<int> &d : dir) {
            int i_ = i + d[0];
            int j_ = j + d[1];
            if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && grid[i_][j_] > 0) {
                sum += dfs(i_, j_, grid);
            }
        }
        return sum;
    }
    int countIslands(vector<vector<int>>& grid, int k) {
        m = grid.size();
        n = grid[0].size();
        long long sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    sum = dfs(i , j , grid);
                    if(sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
};