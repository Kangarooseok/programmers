class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        for(int i = 0; i < included.length; i++ ) {
            result += (included[i] == true) ? a : 0;
            a += d;
        }
        return result;
    }
}