import java.util.*;


public class num01 {
    public static int solution(String[] board){
        int answer = 0;
        for (int i = 0; i<board.length; i++ ) {
            if (i % 2 == 0) {
                for (int j = 0; j < board[i].length(); j += 2) {
                    if (board[i].charAt(j) == 'F')
                        answer = answer + 1;
                }
            } else {
                for (int j = 1; j < board[i].length(); j += 2) {
                    if (board[i].charAt(j) == 'F')
                        answer = answer + 1;
                }
            }

        }
        return answer;
    }
    public static void main(String[] args){
        String[] board = {".F.F...F","F...F.F.","...F.F.F","F.F...F.",".F...F..","F...F.F.",".F.F.F.F","..FF..F."};
        System.out.println(solution(board));
    }
}