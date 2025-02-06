public class Demo064{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        System.out.println("Array after swapping the first and last elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}