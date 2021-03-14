import java.util.*;

public class num05 {
    public static int solution(String text, int width, int height){
        String[] arr = text.split(" ");
        int[] a = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            a[i]=arr[i].length();
        }
        return 0;
    }
    public static void main (String[] args){
        String text = "ONE TWO THREE FOUR FIVE";
        int width = 150;
        int height = 40;
        System.out.println(solution(text, width,height));
    }

}