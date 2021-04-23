package Inflearn2.Updated;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {69, 10, 30, 2, 16};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr) {
        int arr_size = arr.length;

        for (int i = arr_size - 1; i > 0; i--) {
            System.out.println("\n버블 정렬 " + (arr_size - i) + "단계");

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SelectionSort.swap(arr, j, j + 1);
                }
                SelectionSort.printArr(arr);

            }
        }
    }
}
