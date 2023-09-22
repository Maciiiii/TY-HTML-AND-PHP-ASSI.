

import java.io.*;
import java.util.*;

interface cube {
    int calculate(int x);
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        // Lambda expression to define the calculate method
        cube s = (int x) -> x * x * x;

        int ans = s.calculate(n);
        System.out.print("\n Cube of " +n+ " is : " +ans);
    }
}
