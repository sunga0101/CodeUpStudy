/*
10진수를 입력받아 8진수(octal)로 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1031 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String octal = Integer.toOctalString(scanner.nextInt());
        System.out.println(octal);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1031 c = new CodeUp1031();
        c.print();
    }
}
