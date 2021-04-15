public class code04{
    public static void main(String[] args){
        int result = func(5);
        System.out.println(result);
    }
    public static int func(int k){
        if (k==1 || k==2)
            return 1;
        else{
            return func(k-1)+func(k-2);
        }

    }
}