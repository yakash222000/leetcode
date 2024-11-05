class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        if (n == 1) {
            List<String> solution = new ArrayList<>();
            solution.add("Q");
            results.add(solution);
            return results;
        }
        if (n == 2 || n == 3) {
            return results;
        }

        int[] solution = new int[n];
        for (int i = 0; i < n; i++) {
            solution[i] = -1;
        }

        solveNQueensRec(n, solution, 0, results);
        return results;
    }

    private void solveNQueensRec(int n, int[] solution, int row, List<List<String>> results) {
        if (row == n) {
            List<String> solutionStr = constructSolutionString(solution);
            results.add(solutionStr);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValidMove(row, i, solution)) {
                solution[row] = i;
                solveNQueensRec(n, solution, row + 1, results);
                solution[row] = -1;
            }
        }
    }

    private boolean isValidMove(int proposedRow, int proposedCol, int[] solution) {
        for (int i = 0; i < proposedRow; i++) {
            int oldRow = i;
            int oldCol = solution[i];
            int diagonalOffset = proposedRow - oldRow;

            if (oldCol == proposedCol || oldCol == proposedCol - diagonalOffset
                    || oldCol == proposedCol + diagonalOffset) {
                return false;
            }
        }
        return true;
    }

    private List<String> constructSolutionString(int[] solution) {
        List<String> returnArr = new ArrayList<>();
        for (int i = 0; i < solution.length; i++) {
            char[] row = new char[solution.length];
            for (int j = 0; j < solution.length; j++) {
                row[j] = '.';
            }
            row[solution[i]] = 'Q';
            returnArr.add(new String(row));
        }
        return returnArr;
    }
}