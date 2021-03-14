public class code2_3 {
    public static void main(String[] args){
        int num = 32;
        printBi(num);
    }
    public static void printBi(int num){
        if(num<2){
            System.out.print(num);
        }
        else {
            printBi(num/2);
            System.out.print(num%2);
        }
    }

}