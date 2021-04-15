package Inflearn.String_Array;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.
* */
/*
1. Array Index 0부터 끝까지 for 돌려서 target과 비교
2. 16-2 11
3. Map(숫자, 방번호) ->방번호 0,1,2 : 14(16-2), 8(16-8), 5(16-11)
4. 방번호만 리턴한다 int[]
* */
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        TwoSum a = new TwoSum();

        int[] nums = {2,8,11,14};
        int target = 16;
        int[] result = a.solve(nums, target);
        for (int i:result){
            System.out.println(i+" ");
        }
    }

    public int[] solve(int[] nums, int target){
        // 1. ds 담을 그릇
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<> ();
        // 2. for
        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                result[0]=value+1;
                result[1]=i+1;
            }else{
                map.put(target-nums[i], i);
            }
        }
        return result;
    }
}
