package Inflearn2.Updated;
/*메소드 3개로 구성된다.
1) 기본적으로 바꿔주는 swap(두 인덱스를 기반으로 값을 교환)
2) 행렬 출력
3) 선택정렬(첫 인덱스부터 최소 값으로 교환하여 하나하나 채워나간다.)
* */
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3,4,12, 1,6,9, 23,15};
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        int min = 0;
        for (int i=0; i<arr.length-1; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            swap(arr, i,min);
            System.out.println("선택 정렬 "+(i+1)+" 단계 : ");
            printArr(arr);
        }
    }
    static void swap(int[] arr, int i,int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}


