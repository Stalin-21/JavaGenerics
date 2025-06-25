public class MaximumOfStrings {
    public static String findMaximumOfStrings(String a, String b, String c) {
        String max =  a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        return max;
    }
}
