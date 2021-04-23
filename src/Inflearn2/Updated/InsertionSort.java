package Inflearn2.Updated;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {69, 10, 30, 2, 16};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int aux = i - 1;

            while ((aux >= 0) && (arr[aux] > tmp)) {
                arr[aux + 1] = arr[aux];
                aux--;
            }

            arr[aux + 1] = tmp;
            System.out.println("삽입 정렬 " + i + "단계:");
            SelectionSort.printArr(arr);
        }
    }
}
