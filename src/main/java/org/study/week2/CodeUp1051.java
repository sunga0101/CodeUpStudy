/*
두 정수(a, b)를 입력받아 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1051 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.println(iVal1 <=iVal2 ? 1 : 0);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1051 c = new CodeUp1051();
        c.print();
    }
}
