import java.util.*;
public class code3_1{
    public static void main(String[] args){
        int[] arr = {1,23,5,4,23,23,234,46,75};
        System.out.print(findMax(arr, 0,arr.length-1));
    }
    public static int findMax(int[] data, int begin, int end){
        if(begin==end)
            return data[begin];

        else
            return Math.max(data[begin], findMax(data,begin+1,end));
    }
}