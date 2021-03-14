
import java.util.*;
public class num02 {
    public static int solution(String[] signs) {
        String a = signs[signs.length - 1];
        int count = 0;
        if (a.equals("default"))
            return 60;
        else if (a.equals("city")){

            for (int i = 0; i < signs.length; i++) {
                if (signs[i].equals("city")) {
                    count += 1;
                }
            }
            if (count % 2 == 0)
                return 60;
            else
                return 90;

        }
        else {
            return Integer.parseInt(a);
        }
    }

    public static void main (String[] args){
        String[] signs = {"city","40","city","city"};
        System.out.println(solution(signs));
    }

}