/*
두 실수를 입력받아 두 실수의 곱을 출력하되 소수 둘째자리까지 출력하시오.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1117 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        float iVal1 = scanner.nextFloat();
        float iVal2 = scanner.nextFloat();

        System.out.printf("%.2f", iVal1*iVal2);
        }


    public static void main(String[] args) throws IOException {
        CodeUp1117 c = new CodeUp1117();
        c.print();
    }
}