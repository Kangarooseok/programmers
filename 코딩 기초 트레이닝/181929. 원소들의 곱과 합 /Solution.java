import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int Multiply = Arrays.stream(num_list).reduce(1, (a,b) -> a * b);
        int sum = Arrays.stream(num_list).reduce(0, Integer::sum);
        return (Multiply < sum * sum) ? 1 : 0;
    }
}