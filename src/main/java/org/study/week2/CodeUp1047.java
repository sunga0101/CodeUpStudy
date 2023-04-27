/*
정수 1개를 입력받아 2배 곱해 출력해보자. (비트연산자 활용)
 */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1047 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal = scanner.nextInt();
        System.out.printf("%d ", iVal<<1); // 1칸 왼쪽 이동, 1비트(2진)-> 2배
    }

    public static void main(String[] args) throws IOException {
        CodeUp1047 c = new CodeUp1047();
        c.print();
    }
}
