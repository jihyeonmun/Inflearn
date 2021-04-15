package Inflearn.String_Array;

import java.util.*;

/*
1. Sorting
2. hold.end > cur.start
* */
class Interval{
    int start;
    int end;
    Interval(){
        this.start=0;
        this.end=0;
    }
    Interval(int s, int e){
        this.start=s;
        this.end=e;
    }
}

public class MeetingRoom{

    public static void main(String[] args){
        MeetingRoom a = new MeetingRoom();

        Interval in1 = new Interval(30,30);
        Interval in2 = new Interval(0,10);
        Interval in3 = new Interval(15,25);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(a.solve(intervals));
    }

    public boolean solve(Interval[] intervals){
        //1
        if(intervals==null)
            return false;
        //print(intervals);
        Arrays.sort(intervals,Comp);
        //print(intervals);

        //2
        for(int i=1; i< intervals.length; i++) {
            if(intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }
        return true;

    }
    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start -o2.start;
        }
    };
    public void print(Interval[] intervals){
        for(int i=0; i<intervals.length; i++){
            Interval in = intervals[i];
            System.out.println(in.start+" "+in.end);
        }
    }
}