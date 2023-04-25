/*
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1036 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println((int) ch);

    }

    public static void main(String[] args) throws IOException {
        CodeUp1036 c = new CodeUp1036();
        c.print();
    }
}
