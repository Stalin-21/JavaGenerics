public class Main {
    public static void main(String[] args) {

        // Test case for find maximum of integers.
        System.out.println("UC1 TC 1.1 Max: " + MaximumOfIntegers.findMaximumOfIntegers(99, 20, 10));
        System.out.println("UC1 TC 1.2 Max: " + MaximumOfIntegers.findMaximumOfIntegers(10, 99, 20));
        System.out.println("UC1 TC 1.3 Max: " + MaximumOfIntegers.findMaximumOfIntegers(10, 20, 99));

        // Test case for find maximum of Floats.
        System.out.println("UC2 TC 2.1 Max: " + MaximumOfFloats.findMaximumOfFloats(99.9f, 20.5f, 10.2f));
        System.out.println("UC2 TC 2.2 Max: " + MaximumOfFloats.findMaximumOfFloats(10.1f, 99.8f, 20.6f));
        System.out.println("UC2 TC 2.3 Max: " + MaximumOfFloats.findMaximumOfFloats(10.5f, 20.2f, 99.7f));
    }
}