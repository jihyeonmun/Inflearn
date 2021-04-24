package Programmers.Sorting;
/*문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
ex) citations = [3,0,6,1,5], return = 3

확인사항
정렬을 진행해서, 특정 수 이상이 특정 갯수만큼을 만족할때 이 최댓값이 H-index

1. 내림차순으로 정렬
2. 인덱스 올리면서, 인덱스의 이상값인지 판별
3. 인덱스보다 작으면 break;
 */
import java.util.*;
public class H_index {
    public static int solution(int[] citations) {
        int answer = 0;
        Integer[] citation = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citation,Collections.reverseOrder());
        System.out.println(Arrays.toString(citation));
        for(int i=0; i<citation.length; i++){
            if(citation[i]>answer)
                answer++;
            else
                break;
        }
        return answer;
    }
    public static void main(String[] args){
        int[] citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }
}
