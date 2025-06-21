public class ComparisonLogical {
    public static void main(String[] args) {
        //Declare and initialize variables
        int a = 20;
        int b = 30;
        boolean isTrue = true;
        boolean isFalse = false;
        //Comparison operations
        System.out.println("Comparison operations:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        //Logical operations
        System.out.println("\nLogical operations:");
        System.out.println("isTrue && isFalse: " + (isTrue && isFalse)); // Logical AND
        System.out.println("isTrue || isFalse: " + (isTrue || isFalse)); // Logical OR
        System.out.println("!isTrue: " + (!isTrue));
        System.out.println("!isFalse: " + (!isFalse));// Logical NOT
        //Combining comparison and logical operations
        System.out.println("\nCombining comparison and logical operations:");
        System.out.println("(a < b) && isTrue: " + ((a < b) && isTrue));  // true
        System.out.println("(a > b) || isFalse: " + ((a > b) || isFalse)); // false
    }
}
