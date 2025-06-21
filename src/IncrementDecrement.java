public class IncrementDecrement {
    public static void main(String[] args) {

        int i = 5;

        // Post-Increment (i++)
        System.out.println("Post-Increment:");
        System.out.println("Value before i++: " + i);     // 5
        System.out.println("Value returned by i++: " + (i++)); // Still 5
        System.out.println("Value after i++: " + i);      // 6

        // Pre-Increment (++i)
        System.out.println("\nPre-Increment:");
        System.out.println("Value before ++i: " + i);     // 6
        System.out.println("Value returned by ++i: " + (++i)); // 7
        System.out.println("Value after ++i: " + i);      // 7

        // Post-Decrement (i--)
        System.out.println("\nPost-Decrement:");
        System.out.println("Value before i--: " + i);     // 7
        System.out.println("Value returned by i--: " + (i--)); // Still 7
        System.out.println("Value after i--: " + i);      // 6

        // Pre-Decrement (--i)
        System.out.println("\nPre-Decrement:");
        System.out.println("Value before --i: " + i);     // 6
        System.out.println("Value returned by --i: " + (--i)); // 5
        System.out.println("Value after --i: " + i);      // 5
    }
}
