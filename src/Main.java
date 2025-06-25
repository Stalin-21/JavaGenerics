public class Main {
    public static void main(String[] args) {

        GenericMaximum<Integer> intTest = new GenericMaximum<>(1, 3, 2);
        System.out.println("Max Integer: " + intTest.testMaximum());

        GenericMaximum<String> stringTest = new GenericMaximum<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + stringTest.testMaximum());

        GenericMaximum<Float> floatTest = new GenericMaximum<>(3.5f, 6.4f, 2.3f);
        System.out.println("Max Float: " + floatTest.testMaximum());
    }
}