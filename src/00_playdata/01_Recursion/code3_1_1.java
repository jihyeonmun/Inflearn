import java.util.*;
public class code3_1_1{
    public static void main(String[] args){
        int[] arr = {1,23,5,4,23,23,234,46,75};
        System.out.print(findMax(arr, 0,arr.length-1));
    }
    public static int findMax(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];

        else {
            int middle = (begin+end)/2;
            int max1 = findMax(data,begin,middle);
            int max2= findMax(data,middle+1,end);
            return Math.max(max1, max2);
        }
    }
}