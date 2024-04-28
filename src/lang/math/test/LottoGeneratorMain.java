package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        System.out.println(Arrays.toString(generator.generate()));
    }
}
