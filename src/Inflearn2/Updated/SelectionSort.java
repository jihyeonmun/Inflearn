package Inflearn2.Updated;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {69, 10, 30, 2, 16, 8}; // 정렬 전 배열
        SelectionSort.selectionSort(arr);
    }
    public static void selectionSort(int [] arr) {
        int min = 0; // 최저 값을 담을 요소

        for (int i = 0; i < arr.length - 1; i++) {
            min = i; // 첫번째 요소를 선택

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) // 첫번째 요소와 가장 적은 값을 찾는 비교 연산
                    min = j;
            }
            swap(arr, min, i);
            System.out.println("선택 정렬 " + (i + 1) + " 단계: ");
            printArr(arr);
        }
    }

    public static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


