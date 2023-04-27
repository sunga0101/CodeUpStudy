/*
두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1049 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.println(iVal1 > iVal2 ? 1 : 0);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1049 c = new CodeUp1049();
        c.print();
    }
}
