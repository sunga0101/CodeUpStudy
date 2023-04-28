/*
사칙연산 계산기
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1116 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();

        System.out.printf("%d+%d=%d\n", iVal1, iVal2, iVal1+iVal2);
        System.out.printf("%d-%d=%d\n", iVal1, iVal2, iVal1-iVal2);
        System.out.printf("%d*%d=%d\n", iVal1, iVal2, iVal1*iVal2);
        System.out.printf("%d/%d=%d\n", iVal1, iVal2, iVal1/iVal2);
        }


    public static void main(String[] args) throws IOException {
        CodeUp1116 c = new CodeUp1116();
        c.print();
    }
}