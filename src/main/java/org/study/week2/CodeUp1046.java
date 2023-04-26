/*
정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1046 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        int iVal3 = scanner.nextInt();
        long sum = iVal1 + iVal2 + iVal3;
        System.out.println(sum);
        System.out.printf("%.1f ", sum * 1.0 / 3.0);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1046 c = new CodeUp1046();
        c.print();
    }
}
