public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will cause a NullPointerException
        System.out.println("Length of the text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempt to call a method on a null object
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Generate NullPointerException
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Handling NullPointerException:");
        handleException();
    }
}
