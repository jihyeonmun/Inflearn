public class code5_1 {

    private static int N=8;
    public static int[][] grid = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 1},
            {0, 1, 1, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 1},
            {0, 1, 1, 1, 0, 0, 0, 0}
    };


    private static int background_color = 0;
    private static int image_color = 1;
    private static int already_counted= 2;

    public static int countCells(int x, int y){
        int result;
        if(x<0 || x>=N || y<0 || y>=N)
            return 0;
        else if(grid[x][y] != image_color)
            return 0;
        else {
            grid[x][y] = already_counted;
            return 1+countCells(x-1,y+1) + countCells(x,y+1)+
                    countCells(x+1, y+1)+countCells(x-1,y) +
                    countCells(x+1 ,y)+countCells(x-1,y-1)+
                    countCells(x,y-1)+countCells(x+1,y-1);
        }
    }

    public static void main(String[] args){
        System.out.println(countCells(1,1));
    }

}