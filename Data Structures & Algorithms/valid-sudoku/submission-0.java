class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[][] matrix = (Set<Character>[][]) new Set<?>[3][3];

        for (int i = 0; i < 9; i++){
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++){
                // check ith row
                if (board[i][j] != '.' && !row.add(board[i][j])){
                    return false;
                }
                // check ith column 
                if (board[j][i] != '.' && !col.add(board[j][i])){
                    return false;
                } 

                // check matrix
                int gr = i / 3;
                int gc = j / 3;
                if (matrix[gr][gc] == null) {
                    matrix[gr][gc] = new HashSet<>();
                }
                if (board[i][j] != '.' && !matrix[gr][gc].add(board[i][j])){

                    return false;
                }
            }
        }

        return true;
    }
}
