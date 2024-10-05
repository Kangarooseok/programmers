import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] copyArrays = Arrays.copyOf(num_list, num_list.length + 1);
        int emlment1 = num_list[num_list.length -1];
        int emlment2 = num_list[num_list.length -2];
        copyArrays[copyArrays.length-1] = (emlment1 > emlment2) ? emlment1 - emlment2 : emlment1 * 2;
        return copyArrays;
    }
}