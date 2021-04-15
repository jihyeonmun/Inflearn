import java.util.*;
public class code3_2{
    public static void main(String[] args){
        int[] arr = {1,23,5,4,23,23,234,46,75};
        int target = 4;
        //System.out.print(binarySearch(arr, target,0,arr.length-1));
    }
    public static void binarySearch(int[] data, int s,int begin, int end) {
        if (begin>end)
            return;
            //return -1;
        else {
            int middle = (begin+end)/2;
            //int compResult = s.compareTo(data[middle]);
            //if(compResult==0)
            //    return middle;
            //else if (compResult<0)
            //    return binarySearch(data, s,begin,middle-1);
            //else
            //    return binarySearch(data,s,middle+1,end);
        }
    }
}