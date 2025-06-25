public class MaximumOfFloats {
    public static Float findMaximumOfFloats(Float a, Float b, Float c) {
        Float max =  a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        return max;
    }
}
