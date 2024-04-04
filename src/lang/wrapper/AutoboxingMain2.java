package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = 7;

        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
