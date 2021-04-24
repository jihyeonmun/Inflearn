package Inflearn2.Updated;

//public class bubblesort {
//    public static void main(String[] args) {
//        int [] arr = {21,32,11,33,54,23,25};
//        bubbleSort(arr);
//    }
//    public static void bubbleSort(int[] arr) {
//        int arr_size = arr.length;
//
//        for (int i = arr_size - 1; i > 0; i--) {
//            System.out.println("\n버블 정렬 " + (arr_size - i) + "단계");
//
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    SelectionSort.swap(arr, j, j + 1);
//                }
//                SelectionSort.printArr(arr);
//
//            }
//        }
//    }
//}
public class bubblesort {
    public static void main(String[] args){
        int[] arr = {21,32,11,33,54,23,25};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1])
                    SelectionSort.swap(arr, j,j+1);
            }
            System.out.println("버블 정렬 "+(i+1)+"단계 :");
            SelectionSort.printArr(arr);
        }
    }
}
