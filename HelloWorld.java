public class HelloWorld {
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");
        
        // Call the addNumbers method and print the result
        int result = addNumbers(5, 3);
        System.out.println("The sum of 5 and 3 is: " + result);
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

