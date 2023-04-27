/*
입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1059 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal= scanner.nextInt();
        System.out.println(~iVal);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1059 c = new CodeUp1059();
        c.print();
    }
}
