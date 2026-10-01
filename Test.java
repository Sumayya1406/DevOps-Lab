public class Test {
    
    // A simple method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Running Test cases...");

        // Test cases for isEven method
        int test1 = 4;
        int test2 = 7;

        System.out.println("Is " + test1 + " even? " + isEven(test1)); // Expected: true
        System.out.println("Is " + test2 + " even? " + isEven(test2)); // Expected: false
        
        // Assertion check
        assert isEven(4) == true : "Test failed for 4";
        assert isEven(7) == false : "Test failed for 7";
        
        System.out.println("All tests passed successfully!");
    }
}
