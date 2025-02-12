import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12, 45, 78, 23, 56, 89};
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();
        boolean found = isElementFound(arr, element);
        if (found) {
            System.out.println("Element " + element + " is found in the array.");
        } else {
            System.out.println("Element " + element + " is not found in the array.");
        }
        scanner.close();
    }
    public static boolean isElementFound(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true; 
            }
        }
        return false; 
    }
}
