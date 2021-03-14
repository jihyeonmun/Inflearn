public class code02{
    public static void main(String[] args){
        int result = func(4);
        System.out.print(result);
    }

    public static int func(int k){
        if(k<=1)
            return 1;
        else{
            return func(k-1)*k;
        }
    }
}