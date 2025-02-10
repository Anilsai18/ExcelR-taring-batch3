public class Demo068{
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        
        int evenCount = countEvenNumbers(arr);
        
        
        System.out.println("Count of even numbers: " + evenCount);
    }

    
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        
        
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}