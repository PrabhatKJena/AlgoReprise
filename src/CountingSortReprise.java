/**
 * Created by prabhat on 8/9/16.
 */
public class CountingSortReprise {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 5, 1, 2, 9, 7, 4, 5, 5};
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i - 1] + count[i];
        }
        System.out.println(count);
        int out[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        System.out.println(out);
    }

}
