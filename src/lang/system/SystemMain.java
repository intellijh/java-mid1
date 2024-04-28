package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println("getenv = " + System.getenv());

        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] coppiedArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, coppiedArray, 0, originalArray.length);

        System.out.println("coppiedArray = " + coppiedArray);
        System.out.println("Arrays.toString = " +   Arrays.toString(coppiedArray));

        System.exit(0);
    }
}
