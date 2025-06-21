public class Operators {
    public static void main(String[] args) {
        //initial values
        int a = 7;
        int b = 8;
        System.out.println("Arithmetic operations:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        //Assignment operations
        int x = 20;
        System.out.println("\nAssignment operations:");
        System.out.println("Initial x = " + x); // Assignment
        x += 5; // Add and assign
        System.out.println("x += 5: " + x); // x = x + 5
        x -= 3; // Subtract and assign
        System.out.println("x -= 3: " + x); // x = x - 3
        x *= 2; // Multiply and assign
        System.out.println("x *= 2: " + x); // x = x * 2
        x /= 4; // Divide and assign
        System.out.println("x /= 4: " + x); // x = x / 4
        x %= 3; // Modulus and assign
        System.out.println("x %= 3: " + x); // x = x % 3
    }
}
