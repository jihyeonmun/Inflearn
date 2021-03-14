import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int priority:priorities){
            pq.offer(priority);
        }
        while(!pq.isEmpty()){
            for(int i=0;i<priorities.length; i++){
                if(pq.peek()==priorities[i]){
                    pq.poll();
                    answer++;
                    if(location==i){
                        pq.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] a = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(a,location));
    }
}