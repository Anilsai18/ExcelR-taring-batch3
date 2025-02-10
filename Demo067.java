public class Demo067 {
    public static void main(String[] args) {
        int[] arr = {10, 21, 30, 41, 50, 61, 72};
        System.out.println("Even elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}