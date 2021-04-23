package Inflearn2.Recursion;

public class nqueen {
    private static int N = 4;
    private static int level = 4;
    private static int[] cols = new int[N+1];
    public static void main(String[] args){
        queens(level);
    }
    static boolean queens(int level) {
        if(!promising(level))
            return false;
        else if (level==N) {
            for (int i = 1; i <= N; i++)
                System.out.println("(" + i + "," + cols[i] + ")");
            return true;
        }
        else{
            for(int i=1; i<=N; i++){
                cols[level+1] = i;
                if (queens(level+1))
                    return true;
            }
            return false;
        }
    }
    static boolean promising(int level)
    {
        for (int i=1; i<level; i++){
            if(cols[i]==cols[level]) //같은 열검사
                return false;
            else if (level-i == Math.abs(cols[level]-cols[i]))// 대각선 검사
                return false;
        }
        return true;
    }
}
