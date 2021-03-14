public class code7_1 {
    public static void main(String[] args){
        powerSet(n);
    }
    public static char data[] = {'a', 'b', 'c', 'd','e', 'f'};
    public static int n = data.length;
    public static boolean[] include = new boolean [n];

    public static void powerSet(int k){
        if(k==n) {
            for(int i=0; i<n; i++)
                if (include[i]) System.out.print(data[i] + " ");
            System.out.println();
            return;
        }
        include[k] =false;
        powerSet(k+1);
        include[k]=true;
        powerSet(k+1);
    }
}