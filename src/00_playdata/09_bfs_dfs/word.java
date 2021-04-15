import java.util.*;

public class word {

    public static boolean isDiffOneChar(String str1, String str2) {
        int cnt = 0;
        for (int i = 0; i < str1.length() && cnt < 2; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }

    public static int dfs(String begin, String target, int index, String[] words, boolean[] visited, int cnt) {

        if (begin.equals(target)) {
            return cnt;
        }

        if (visited[index]) {
            return cnt;
        }

        visited[index] = true;

        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (index != i && isDiffOneChar(begin, words[i]) && !visited[i]) {
                ans = dfs(words[i], target, i, words, visited, cnt + 1);
            }
        }
        return ans;
    }

    public static int solution(String begin, String target, String[] words) {
        int answer = words.length + 1;

        for (int i = 0; i < words.length; i++) {
            boolean[] visited = new boolean[words.length];
            if (isDiffOneChar(begin, words[i])) {
                answer = Math.min(answer, dfs(words[i], target, i, words, visited, 1));
            }
        }

        if (answer == words.length + 1) {
            return 0;
        }
        return answer;
    }

    public static void main(String[] args){
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin,target,words));

    }


}