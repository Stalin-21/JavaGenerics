public class GenericMaximum<T extends Comparable<T>> {

    T x,y,z;

   public GenericMaximum(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum(){
       return findMaximum(x,y,z);
    }

    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        return max;
    }

    public static <T extends Comparable<T>> T findMaximum(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value is required");
        }
        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> void printMax(T... values) {
        T max = findMaximum(values);
        System.out.println("Maximum value: " + max);
    }


}
