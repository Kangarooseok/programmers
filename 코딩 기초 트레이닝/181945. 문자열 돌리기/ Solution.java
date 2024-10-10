import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        String a = new Scanner(System.in).next();
        a.chars().forEach(c-> System.out.println((char) c));
    }
}