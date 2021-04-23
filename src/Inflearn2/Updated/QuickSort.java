package Inflearn2.Updated;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {69, 10, 30, 2, 16, 8, 31, 22};
        QuickSort.quickSort(arr, 0, arr.length - 1);
    }
    static int i = 0;

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int p = partition(arr, begin, end);
            quickSort(arr, begin, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {
        int left = begin;
        int right = end;

        int pivot = (left + right) / 2;

        System.out.println("[퀵 정렬 " + ++i + "단계: pivot: " + arr[pivot]);

        while (left < right) {
            while ((arr[left] < arr[pivot]) && (left < right))
                // L 움직이는 부분
                left++;
            while ((arr[right] >= arr[pivot]) && (left < right))
                // R 움직이는 부분
                right--;

            if (left < right) {
                SelectionSort.swap(arr, left, right);
            }
        }

        SelectionSort.swap(arr, pivot, right);

        SelectionSort.printArr(arr);

        return left;
    }
}
