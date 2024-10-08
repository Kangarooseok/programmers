import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c) {
        int[] diceResults = new int[]{a, b, c};

        long count = Arrays.stream(diceResults).distinct().count();
        int sum = Arrays.stream(diceResults).reduce(0, Integer::sum);
        int sum2 = Arrays.stream(diceResults).map(n -> n * n).reduce(0, Integer::sum);
        int sum3 = Arrays.stream(diceResults).map(n -> n * n * n).reduce(0, Integer::sum);

        switch ((int) count) {
            case 3: return sum;
            case 2: return sum * sum2;
            case 1: return sum * sum2 * sum3;
        }
        return 0;
    }
}