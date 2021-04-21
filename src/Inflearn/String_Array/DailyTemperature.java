package Inflearn.String_Array;
/*
Given a list of daily temperature T, return a list such that, for each day in the input, telss
you how mnay days you would have to wait until a warmer temperature. If there is no future day for which
this is possible, put 0 instead

For example, given the list of temperatures
T = [73,74,75,71,69,72,76,73],
output = [1,1,4,2,1,1,0,0]

The length of temperatures will be in the range [1,30000].
Each temperature will be an integer in the range [30,100].
* */

/*1. 문제를 정확히 이해
2. 담을 그릇을 정한다(Data Structure)
3. for, while문 돌리기
* */

/*
* index가 [1 2 6 5 5 6 0 0], [0 1 2 3 4 5 6 7]
* */

import java.util.*;
public class DailyTemperature {
    public static void main(String[] args){
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] res = solve(nums);

        for (int i : res){
            System.out.println(i + " ");
        }
    }
    public static int[] solve(int[] temperatures){
        // 1. ds
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        // 2. for, while algo
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int index = stack.pop(); //peek()+remove()
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
