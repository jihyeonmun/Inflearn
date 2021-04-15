import java.util.*;

public class code2_5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //readFrom(n,num, in);
    }
    public static void readFrom(int n,int[] num, Scanner in){
        if(n==0){
            return;
        }
        else {
            readFrom(n-1, num, in);
            num[n-1] = in.nextInt();
        }
    }

}