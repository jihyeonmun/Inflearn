import java.util.*;

public class num04 {
    public static int solution(String[] currentLanes){
        String a = currentLanes[currentLanes.length-1];
        int max = currentLanes[0].length();
        for(int i = 0; i<currentLanes.length-1; i++){
            if (max<currentLanes[i+1].length())
                max = currentLanes[i+1].length();
        }
        if(a.indexOf("D")==-1){
            //마지막 일단 먼저 보내고 시작
            int count = currentLanes[currentLanes.length-1].length()-1;
            //D 찾기 (각 첫번째 문자부터 비교)
            //처음과 끝 길이 같으면 모두 양보했음!
            if (currentLanes[0].length()!=currentLanes[currentLanes.length-1].length()){
                for(int j = 0; j<max; j++){
                    for(int i = 0; i<currentLanes.length-1; i++) {
                        try{
                            if (currentLanes[i].charAt(j) != 'D')
                                count += 1;
                            else
                                return count+1;
                        }catch(StringIndexOutOfBoundsException e){
                            count = count;
                        }

                    }
                }
            }
            else{
                for(int i = 0; i<currentLanes.length-1; i++) {
                    if(currentLanes[i].indexOf("D")==-1){
                        count = count+currentLanes[i].length();
                    }
                    else{
                        count = count+currentLanes[i].indexOf("D")+1;
                        return count;
                    }

                }
            }

        }else {
            return a.indexOf("D");
        }
        return 0;
    }


    public static void main (String[] args){
        String[] currentLanes =  {"AH","D","BCG","E","F"};
        System.out.println(solution(currentLanes));
    }
}