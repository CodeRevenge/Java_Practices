package com.codekiller;

import java.util.Scanner;

public class Problems {
    private static final Scanner scanner = new Scanner(System.in);

    public Problems() {
    }

    public void run(int problem) {
        switch (problem) {
            case 1:
                prob01();
                break;
            case 2:
                prob02();
                break;
            case 3:
                prob03();
                break;
            case 4:
                prob04();
                break;
            case 5:
                prob05();
                break;
            case 6:
                break;
            default:
                break;
        }
    }

    void prob01() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    void prob02() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    void prob03() {
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    void prob04() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 0) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

    void prob05() {

    }

    void prob06() {

    }

    void prob07() {

    }
}
