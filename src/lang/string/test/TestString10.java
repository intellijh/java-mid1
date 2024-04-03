package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] output = fruits.split(",");
        for (String string : output) {
            System.out.println(string);
        }

        String joinedString = String.join("->", output);
        System.out.println("joinedString = " + joinedString);
    }
}
