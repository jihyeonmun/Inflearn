public class code05{
    public static void main(String[] args){
        double result = func(121,66);
        System.out.println(result);
    }
    public static double func(int k, int n){
        if (k%n==0)
            return n;
        else
            return func(n,k%n);
    }
}