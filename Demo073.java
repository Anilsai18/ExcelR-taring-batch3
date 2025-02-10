import java.util.HashSet;
public class Demo073{
    public static void printDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                duplicates.add(num); 
            } else {
                seen.add(num); 
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements in the array:");
            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7};
        printDuplicates(array);
    }
}