class Solution {
    public int solution(int a, int b) {
        int count = 0;
        int c = a, d = b;
        for (int i = 1; i <= b; i *= 10) count++;
        for (int i = 0; i < count; i++) a*=10;

        count = 0;
        for (int i = 1; i <= c; i *= 10) count++;
        for (int i = 0; i < count; i++) d*=10;

        return (a + b > c + d ? a + b : c + d );
    }
}