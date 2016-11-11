import java.util.Arrays;

/**
 * Created by prabhat on 8/9/16.
 */
public class QuickSortReprise {
    public static void main(String[] args) {
        int arr[] = new int[]{-2, 11, 3, 55, 46, 7, 88, 34};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    private static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int p = findPivot1(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }

    private static int findPivot1(int[] arr, int l, int h) {
        int i = l, j = h;
        while (i < j) {
            for (; i < h && arr[i] < arr[h]; i++) ;
            for (; j >= l && arr[j] >= arr[h]; j--) ;
            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, i, h);
        return i;
    }

    private static int findPivot(int[] arr, int l, int h) {
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] <= arr[h]) {
                i++;
                if (j != i) {
                    swap(arr, i, j);
                }
            }

        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
