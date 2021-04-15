public class code03{
    public static void main(String[] args){
        double result = func(4,2);
        System.out.println(result);
    }
    public static double func(double k, int n){
        if(n==0)
            return 1;
        else{
            return k*func(k,n-1);
        }
    }
}