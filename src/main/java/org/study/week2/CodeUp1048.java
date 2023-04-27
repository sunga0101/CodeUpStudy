/*
정수 2개(a, b)를 입력받아 a를 2의 b승 배 곱한 값으로 출력해보자. (비트연산자 활용)
 */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1048 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        // a * 2 의 b승 -> a << b 연산
        System.out.printf("%d", iVal1 << iVal2);
    }
    public static void main(String[] args) throws IOException {
        CodeUp1048 c = new CodeUp1048();
        c.print();
    }
}
