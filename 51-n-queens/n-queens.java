class Solution {
    public static boolean check_safe(int arr[], int row, int col) {
        int w_row;
        int w_col;
        for (w_row = row - 1, w_col = col - 1; (w_row >= 0 && w_col >= 0); w_row--, w_col--) {
            if (arr[w_row] == w_col) {
                return false;
            }
        }

        for (w_row = row - 1, w_col = col + 1; (w_row >= 0 && w_col < arr.length); w_row--, w_col++) {
            if (arr[w_row] == w_col) {
                return false;
            }
        }

        for (w_row = row - 1, w_col = col; w_row >= 0; w_row--) {
            if (arr[w_row] == w_col) {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = -1;
        }

        int col = 0;
        int row = 0;

        while (row >= 0) {
            while (col < n) {
                if (check_safe(arr, row, col)) {
                    arr[row] = col;
                    row++;
                    col = 0;
                    break;
                } else {
                    col++;
                }
            }

            if (col == n || row == n) {
                if (row == n) {
                    results.add(buildBoard(arr));
                    row--;
                    col = arr[row] + 1;
                    arr[row] = -1;
                } else {
                    row--;
                    if (row >= 0) {
                        col = arr[row] + 1;
                        arr[row] = -1;
                    }
                }
            }
        }

        return results;
    }

    private List<String> buildBoard(int[] arr) {
        List<String> board = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[arr[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
