/*
16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1035 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.next(), 16); //16진수 -> 10진수
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1035 c = new CodeUp1035();
        c.print();
    }
}
