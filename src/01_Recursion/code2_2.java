public class code2_2 {
    public static void main(String[] args){
        String s = "abcde";
        printStr(s);
    }
    public static void printStr(String str){
        if(str.length()==0){
            return;
        }
        else {
            printStr(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

}