package com.codekiller;

import java.util.ArrayList;
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
                prob06();
                break;
            case 7:
                prob07();
                break;
            case 8:
                prob08();
                break;
            case 9:
                prob09();
                break;
            case 10:
                prob10();
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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", N, i, N * i);
        }
    }

    void prob06() {
        int t = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            n.add(scanner.nextInt());
        }

        for (int i = 0; i < t; i++) {
            String resultList = "";
            for (int j = 1; j <= n.get(i); j++) {
                int result = a.get(i);
                for (int k = 0; k < j; k++) {
                    result += Math.pow(2, k) * b.get(i);
                }
                resultList += result + " ";
            }
            resultList = resultList.substring(0, resultList.length() - 1);
            System.out.println(resultList);
        }


    }

    void prob07() {
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) System.out.println("* long");

//                if (x >= -32_768 && x <= 32_767) System.out.println("* short");
//                if (x >= -2_147_483_648 && x <= 2_147_483_647) System.out.println("* int");
//                if (x >= -9_223_372_036_854_775_808L && x <= 9_223_372_036_854_775_807L) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }

    void prob08() {
        int i = 1;
        while (scanner.hasNext()) {
            System.out.printf("%d %s%n",i, scanner.nextLine());
            i++;
        }
    }

    void prob09() {

    }

    void prob10() {

    }
}
