package com.codekiller;

import java.util.Scanner;

public class _03_JavaStdinAndStdoutII extends Problem {
    public _03_JavaStdinAndStdoutII() {
        super("Java Stdin and Stdout II", 03);
        setFinalScore(10);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
