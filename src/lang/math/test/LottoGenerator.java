package lang.math.test;

public class LottoGenerator {

    private int[] lotto = new int[6];

    public int[] generate() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)( Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        return lotto;
    }
}
