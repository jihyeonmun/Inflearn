package Inflearn.String_Array;
/* Problem : Given a collection of intervals, merge all overlapping intervals

Example
Inpuut : [[1,3],[2,6],[8,10],[15,18]]
Output : [[1,6],[8,10],[15,18]]
* */
import java.util.*;

class Interval{
    int start;
    int end;
    Interval() {start = 0; end = 0;}
    Interval(int s, int e){start = s; end = e;}
}

public class MergerInterval {
    public static void main(String[] args){
        Interval in1 = new Interval(1,3);
        Interval in2 = new Interval(2,6);
        Interval in3 = new Interval(8,10);
        Interval in4 = new Interval(15,18);

        List <Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);

        Interval a = new interval();
        List<Interval> list = a.merge(intervals);
        a.print(list);
    }
    public
}
