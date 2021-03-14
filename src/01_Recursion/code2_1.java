public class code2_1 {
    public static void main(String[] args){
        String s = "abcde";
        System.out.println(length(s));
    }
    public static int length(String str){
        if(str.equals(""))
            return 0;
        else
            return 1+length(str.substring(1));
    }
}