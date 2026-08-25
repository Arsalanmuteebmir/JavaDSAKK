import java.util.*;

public class BS_positioninaInfinitearray {
    public static int position(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]) { // bcz we are using fiinite(target>arr[end])
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 23, 34, 45 };
        int target = 45;
        System.out.println(position(arr, target));
    }
}
