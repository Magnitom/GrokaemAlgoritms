package quicksort;


import java.util.Random;

public class QiuckSortRecurs {

    public void qSortArr(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int indexPivot = new Random().nextInt(endIndex - startIndex) + startIndex;
        int pivot = arr[indexPivot];

        int leftIndex = startIndex;
        int rightIndex = endIndex;

        while (leftIndex < rightIndex) {
            while (arr[leftIndex] < pivot && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot && leftIndex < rightIndex) {
                rightIndex--;
            }
            swap(arr, leftIndex, rightIndex);
        }

        qSortArr(arr, startIndex, leftIndex - 1);
        qSortArr(arr, leftIndex + 1, endIndex);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
