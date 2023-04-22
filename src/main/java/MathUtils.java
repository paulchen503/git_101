
import System;
// This class contains functions for finding 
// Greatest Common Divisor and Least Common Multiple
public class MathUtils {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("GCD(10, 24)="+ gcd(10, 24));
        System.out.println("LCM(10, 24)="+ lcm(10, 24));
    }
}