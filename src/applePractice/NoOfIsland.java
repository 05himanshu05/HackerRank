package applePractice;

public class NoOfIsland {

    static void main() {

        char[][] arr = {
                {'1', '1', '1','1','0'},
                {'1', '1', '0','1','0'},
                {'1', '1', '0','0','0'},
                {'0', '0', '0','0','0'}
        };

        int i = numIslands(arr);
        System.out.println(i);
    }

    private static void dfs(int row, int col, char[][] grid, boolean[][] visited, int i, int j) {

        if (i<0 || j<0 || i>=row || j>=col || grid[i][j]!='1' || visited[i][j]) { return;}

        visited[i][j] = true;

        dfs(row,col,grid,visited,i-1,j);
        dfs(row,col,grid,visited,i,j+1);
        dfs(row,col,grid,visited,i+1,j);
        dfs(row,col,grid,visited,i,j-1);
    }
    public static int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int island = 0;

        boolean[][] visited = new boolean[row][col];
        for (int i=0 ; i<row;i++) {
            for (int j=0;j<col;j++) {
                visited[i][j] = false;
            }
        }

        for(int i=0 ; i<row;i++) {
            for(int j=0;j<col;j++){
                if (grid[i][j] =='1' && !visited[i][j]){
                    dfs(row,col,grid,visited,i,j);
                    island++;
                }
            }
        }

        return island;
    }

}
