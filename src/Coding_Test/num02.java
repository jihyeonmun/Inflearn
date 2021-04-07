package Coding_Test;
import java.util.*;
public class num02 {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int [][] table = new int[rows][columns];
        for (int i=0; i<columns; i++){
            for (int j=0; j<rows;j++){
                table[i][j]=i+columns*j+1;
            }
        }
        for (int i=0; i< queries.length; i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            int tmp = table[x1-1][y2-1]; //2,4
            int min = tmp;
            int tmp2 = table[x2-1][y2-1]; //5,4
            int tmp3 = table[x2-1][y1-1]; //5,2
            for(int j = y2-1; j>y1-1; j--){
                table[x1-1][j]=table[x1-1][j-1];
                if (min>table[x1-1][j-1]){
                    min = table[x1-1][j-1];
                }
            }
            for(int j = x2-1; j>x1-1; j--){
                if(j==x1){
                    table[j][y2-1]=tmp;
                }
                else{
                    table[j][y2-1] = table[j-1][y2-1];
                }
                if (min>table[j-1][y2-1]){
                    min = table[j-1][y2-1];
                }
            }
            for(int j = y2-2; j>y1-2; j--){
                if(j==y2-2){
                    table[x2-1][j]=tmp2;
                }
                else{
                    table[x2-1][j] = table[x2-1][j+1];
                }
                if (min>table[x2-1][j]){
                    min = table[x2-1][j];
                }
            }
            for(int j = x2-2; j>x1-2; j--){
                if(j==x2-2){
                    table[x2-2][y1-1]=tmp3;
                }
                else {
                    table[j][y1-1] = table[j+1][y1-1];
                }
                if (min>table[j][y1-1]){
                    min = table[j][y1-1];
                }
            }
            answer[i]=min;
        }
        return answer;
    }
    public static void main(String[] args){
        int rows = 3;
        int columns =3;
        int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        System.out.println(Arrays.toString(solution(rows,columns,queries)));
    }
}
