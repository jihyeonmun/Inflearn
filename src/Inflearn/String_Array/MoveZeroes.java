package Inflearn.String_Array;

public class MoveZeroes {
    public void moveZeroes(int[] nums){
        //1
        int[] num = {0, 3, 2, 0, 8, 5};
        int index = 0;

        //2
        for(int i=0; i<nums.length; i++){
            if(num[i] !=0){
                num[index] = nums[i];
                index++;
                System.out.println("index"+index);
            }
        }

        //3
        while(index<num.length){
            num[index]=0;
            index++;
        }
        //4
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
