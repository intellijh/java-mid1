package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmnutableAddress a = new ImmnutableAddress("서울");
        ImmnutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산");
        b = new ImmnutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
