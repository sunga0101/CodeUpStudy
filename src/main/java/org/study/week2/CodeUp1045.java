/*
정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1045 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.println(iVal1+iVal2);
        System.out.println(iVal1-iVal2);
        System.out.println(iVal1*iVal2);
        System.out.println(iVal1/iVal2);
        System.out.println(iVal1%iVal2);
        System.out.printf("%.2f",(iVal1*1.0) /(iVal2*1.0));
    }

    public static void main(String[] args) throws IOException {
        CodeUp1045 c = new CodeUp1045();
        c.print();
    }
}
