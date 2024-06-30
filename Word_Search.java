public class Word_Search {
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        // Try to find the word starting from each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, word, visited, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean search(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
        // If index equals the length of the word, we found the word
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and character match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the current cell as visited
        visited[i][j] = true;

        // Recursively search in all four directions
        boolean found = search(board, word, visited, i + 1, j, index + 1)
                    || search(board, word, visited, i - 1, j, index + 1)
                    || search(board, word, visited, i, j + 1, index + 1)
                    || search(board, word, visited, i, j - 1, index + 1);

        // Backtrack: Unmark the current cell as visited
        visited[i][j] = false;

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println(exist(board, word1)); // Output: true
        System.out.println(exist(board, word2)); // Output: true
        System.out.println(exist(board, word3)); // Output: false
    }
}
