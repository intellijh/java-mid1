package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] output = email.split("@");
        System.out.println("ID: " + output[0]);
        System.out.println("Domain: " + output[1]);
    }
}
