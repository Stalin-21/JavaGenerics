public class GenericMaximum {
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        return max;
    }
}
