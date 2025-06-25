public class MaximumOfIntegers {
    public static Integer findMaximumOfIntegers(Integer a, Integer b, Integer c) {
        Integer max =  a.compareTo(b) > 0 ? a : b;
         max = max.compareTo(c) > 0 ? max : c;
         return max;
        }
    }


