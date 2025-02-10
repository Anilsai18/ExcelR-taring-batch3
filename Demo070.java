public class Demo070{
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5, 16, 17, 18, 19, 20, 23, 24};

        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}