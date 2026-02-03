package applePractice;

public class WordSearchInGrid {
    static void main() {

        char[][] arr1 = {
                {'c', 'a', 'c','d','e'},
                {'o', 'm', 'i','l','k'},
                {'r', 't', 'j','l','o'},
                {'s', 'd', 'p','i','m'}
        };

        char[][] arr = {
                {'c', 'a', 'a'},
                {'a', 'a', 'a'},
                {'b', 'c', 'd'}
        };

        boolean omi = exist(arr, "aab");
        System.out.println(omi);
    }

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        boolean[][] visited = new boolean[row][col];
        for (int i=0 ; i<row;i++) {
            for (int j=0;j<col;j++) {
                visited[i][j] = false;
            }
        }

        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if (board[i][j]==word.charAt(0)){
                    if (dfs(board,word,0,i,j,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] grid,String word, int index, int i, int j,boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (i<0||j<0||i>grid.length-1||j>grid[0].length-1||visited[i][j]||grid[i][j]!=word.charAt(index)){
            return false;
        }
        visited[i][j] = true;
        boolean found = dfs(grid,word,index+1,i+1,j,visited) ||
                dfs(grid,word,index+1,i,j+1,visited) ||
                dfs(grid,word,index+1,i,j-1,visited) ||
                dfs(grid,word,index+1,i-1,j,visited);

        return found;
    }
}
