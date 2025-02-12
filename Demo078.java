import java.util.Arrays;
public class Demo078 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 6, 5, 2, 8, 3, 1};
        rearrangeEvenOdd(arr);
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
    public static void rearrangeEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            }
            else if (arr[right] % 2 != 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}