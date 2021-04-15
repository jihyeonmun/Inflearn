
import java.util.Arrays;

public class codezip {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int tmp;
        for(int i = 0; i<prices.length; i++){
            tmp = prices[i];
            int count = 0;
            for(int j = i; j<prices.length; j++){
                if(tmp<=prices[j]){
                    count+=1;
                }
                else if (j==prices.length){
                    answer[i] = count;
                    break;
                }
                else {
                    answer[i] = count;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,2,3};
        System.out.println(Arrays.toString(solution(a)));
    }
}