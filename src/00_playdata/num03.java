import java.util.*;


public class num03 {
    public static int[] solution(int[] trophies){
        int a=1;
        int b=1;
        int tmp_a = trophies[0];
        int tmp_b = trophies[trophies.length-1];
        for(int i=0; i<trophies.length-1; i++) {
            if (tmp_a < trophies[i + 1]){
                tmp_a = trophies[i + 1];
                a += 1;
            }
        }
        for(int i=trophies.length-1; i>0; i--){
            if(tmp_b<trophies[i-1]) {
                tmp_b = trophies[i - 1];
                b += 1;
            }
        }

        int[] arr = {a,b};
        return arr;
    }


    public static void main (String[] args){
        int[] trophies = {1,2,5,2,1};
        System.out.println(Arrays.toString(solution(trophies)));
    }

}