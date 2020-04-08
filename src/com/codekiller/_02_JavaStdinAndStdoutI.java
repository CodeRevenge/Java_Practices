package com.codekiller;

import java.util.Scanner;

public class _02_JavaStdinAndStdoutI extends Problem {
    public _02_JavaStdinAndStdoutI() {
        super("Java Stdin and Stdout I", 02);
        finalScore = 5;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
