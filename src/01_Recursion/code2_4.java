public class code2_4 {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6};
        System.out.print(printArraySum(num.length,num));
    }
    public static int printArraySum(int n,int[] num){
        if(n==1){
            return num[0];
        }
        else {
            return num[n-1]+printArraySum(n-1,num);
        }
    }

}