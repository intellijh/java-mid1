package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Printer printer) {
        System.out.println("프로그램 시작");

        printer.print();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        Printer dice = new Printer() {
            @Override
            public void print() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Printer sum = new Printer() {
            @Override
            public void print() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}
