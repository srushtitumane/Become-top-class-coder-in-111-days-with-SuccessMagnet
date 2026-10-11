class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];

                if (r != '.' && !row.add(r)) {
                    return false;
                }

                if (c != '.' && !col.add(c)) {
                    return false;
                }
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                HashSet<Character> set = new HashSet<>();

                for (int i = r; i < r + 3; i++) {
                    for (int j = c; j < c + 3; j++) {
                        char ch = board[i][j];

                        if (ch != '.' && !set.add(ch)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}