public class Main {
    public static void main(String[] args) {

        GenericMaximum<Integer> intTest = new GenericMaximum<>(1, 3, 2);
        System.out.println("Max Integer: " + intTest.testMaximum());

        GenericMaximum<String> stringTest = new GenericMaximum<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + stringTest.testMaximum());

        GenericMaximum<Float> floatTest = new GenericMaximum<>(3.5f, 6.4f, 2.3f);
        System.out.println("Max Float: " + floatTest.testMaximum());

        System.out.println("UC4 Max Integer: " + GenericMaximum.findMaximum(10, 20, 30, 50, 40));
        System.out.println("UC4 Max Float: " + GenericMaximum.findMaximum(2.1f, 3.3f, 1.5f, 6.7f, 4.9f));
        System.out.println("UC4 Max String: " + GenericMaximum.findMaximum("Apple", "Peach", "Banana", "Watermelon"));

        System.out.print("UC5 Max Integer: ");
        GenericMaximum.printMax(10, 20, 5, 35, 25);

        System.out.print("UC5 Max Float: ");
        GenericMaximum.printMax(3.2f, 4.5f, 6.1f, 2.9f);

        System.out.print("UC5 Max String: ");
        GenericMaximum.printMax("Banana", "Apple", "Mango", "Peach");


    }
}