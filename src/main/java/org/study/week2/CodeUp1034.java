/*
8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1034 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.next(), 8);
        System.out.println(decimal);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1034 c = new CodeUp1034();
        c.print();
    }
}
