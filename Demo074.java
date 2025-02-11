public class Demo074 {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        Demo074 obj = new Demo074();
        int[] arr = {5, 2, 8, 1, 3};
        obj.sort(arr);
    }
}
