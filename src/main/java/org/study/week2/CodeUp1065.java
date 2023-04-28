/*
세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1065 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        if (iVal1 % 2 == 0) {
            System.out.println(iVal1);
        }
        int iVal2 = scanner.nextInt();
        if (iVal2 % 2 == 0) {
            System.out.println(iVal2);
        }
        int iVal3 = scanner.nextInt();
        if (iVal3 % 2 == 0) {
            System.out.println(iVal3);
        }
    }

    public static void main(String[] args) throws IOException {
        CodeUp1065 c = new CodeUp1065();
        c.print();
    }
}
