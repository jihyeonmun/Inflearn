package Inflearn2.Recursion;

public class Blob {
    public static void printGrid(int n, int[][]grid){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        System.out.println("처음 그리드!");
        printGrid(N, grid);
        int a = countCells(3, 5);
        System.out.println("그리드 문제 해결!");
        printGrid(N, grid);
        System.out.println(a);
    }
    private static int [][] grid = {
            {1,0,0,0,0,0,0,1},
            {0,1,1,0,0,1,0,0},
            {1,1,0,0,1,0,1,0},
            {0,0,0,0,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {1,0,0,0,1,0,0,1},
            {0,1,1,0,0,1,1,1}
    };
    private static int N = grid[1].length;
    private static int BACKGROUND_COLOR = 0;
    private static int IMAGE_COLOR = 1;
    private static int ALREADY_COUNTED = 2;

    public static int countCells(int x, int y){
        int result;
        if(x<0 || x>=N || y<0 || y>=N)
            return 0;
        else if (grid[x][y] != IMAGE_COLOR)
            return 0;
        else {
            grid[x][y] = ALREADY_COUNTED;
            return 1+countCells(x-1,y+1)+countCells(x,y+1)+countCells(x+1,y+1)
                    +countCells(x-1,y)+countCells(x+1,y)+countCells(x-1,y-1)
                    +countCells(x,y-1)+countCells(x+1,y-1);
        }
    }
}
