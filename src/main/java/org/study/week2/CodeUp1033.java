/*
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1033 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String hexStr = Integer.toHexString(scanner.nextInt());
        System.out.println(hexStr.toUpperCase());
    }

    public static void main(String[] args) throws IOException {
        CodeUp1033 c = new CodeUp1033();
        c.print();
    }
}
