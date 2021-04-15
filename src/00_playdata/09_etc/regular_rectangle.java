public class regular_rectangle {
    //대각선 상에서 지나가는 구간은 최소공배수로 나눈 칸만큼에서,
    // 양 끝단만 제외한 칸을 모두 지나간다.
    //결국은 기울기 곡선으로 뺴야 하는데,
    //최대공약수 나눈 값 여기서는 2*3-2 하면 된다.
    static long solution(int w, int h) {
        return  (long)(w*h-(w+h-GCD(w,h)));
    }

    public static int GCD(int w, int h){
        if (w%h ==0)
            return h;
        else
            return GCD(h, w%h);
    }


    public static void main (String[] args){
        int w = 8;
        int h = 12;
        //System.out.println(GCD(w,h));
        System.out.println(solution(w,h));
    }

}