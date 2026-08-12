class Solution {
    List<List<String>> result = new ArrayList<>();
    int N;

    Boolean isValid(List<String> board, int row, int col) {
        //upward check
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        //left diagonal check 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        //right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    void solve(List<String> board, int row) {
        if (row >= N) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < N; col++) {

            if (isValid(board, row, col)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());

                solve(board, row + 1);

                //BACKTRACK
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        N = n;
       

        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        solve(board, 0);

        return result;
    }
}