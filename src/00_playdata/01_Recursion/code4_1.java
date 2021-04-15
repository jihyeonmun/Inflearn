import javax.swing.*;
import java.util.Arrays;

public class code4_1{
    private static int N=8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 1},
            {0, 1, 1, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 1},
            {0, 1, 1, 1, 0, 0, 0, 0}
    };

    private static final int pathway_color=0;
    private static final int wall_color=1;
    private static final int blocked_color=2;
    private static final int path_color=3;

    public static boolean findMazePath(int x, int y){
        //유효한 범위 체크하기!!
        if(x<0 || y<0 || x>=N || y>=N)
            return false;
        else if (maze[x][y] !=pathway_color)
            return false;
        else if (x==N-1 && y==N-1){
            maze[x][y] = path_color;
            return true;
        }
        else {
            maze[x][y] =  path_color;
            if(findMazePath(x-1,y) || findMazePath(x,y+1)||
            findMazePath(x+1,y)||findMazePath(x,y-1)){
                return true;
            }
            maze[x][y] = blocked_color;
            return false;
        }
    }
    public static void mazePrint(int[][] data){
        for (int i = 0; i < data.length * data[0].length; i++) {
            int row = i / data[0].length; // 행
            int column = i % data[0].length; // 열
            System.out.print(data[row][column] + "\t");


            if (column == data[0].length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        mazePrint(maze);
        findMazePath(0,0);
        System.out.println();
        mazePrint(maze);
    }

}