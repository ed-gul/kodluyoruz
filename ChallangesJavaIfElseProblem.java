/* for harckerrank - https://www.hackerrank.com/challenges/java-if-else/problem
Given an integer n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n is weird.

Input Format
A single line containing a positive integer, n.

Constraints
1 <= n <= 100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.
 */
package Giris;

import java.util.Scanner;

public class ChallangesJavaIfElseProblem {
    public static void main (String [] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        //System.out.println("value for n? ");
        n=inp.nextInt();
        if (n>0 && n<101){
            if (n%2 == 0) {
                if (1 < n && n < 6) {
                System.out.println("Not Weird");
                } else if (5 < n && n < 21) {
                System.out.println("Weird");
                } else {
                System.out.println("Not Weird");
                }
            } else System.out.println("Weird");
        } else {
            System.out.println("Constraints 1<=n<=100");
            }
    }
}
