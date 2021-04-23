package Inflearn2.Recursion;

public class powerset {
    private static char data[] = {'a','b','c','d','e','f'};
    private static int n = data.length;
    private static boolean[] include = new boolean[n];

    public static void powerSet(int k){ //트리상에서 현재 나의 위치를 표현함
        if (k==n){ //만약 위치가 리프노드라면
            for (int i =0; i<n; i++){
                if (include[i]) System.out.println(data[i]+" ");
            }
            System.out.println();
            return;
        }
        include[k] = false;
        powerSet(k+1); //먼저 왼쪽으로 내려갔다가
        include[k]=true;
        powerSet(k+1); //이번엔 오른쪽으로 내려간다.
    }
}
