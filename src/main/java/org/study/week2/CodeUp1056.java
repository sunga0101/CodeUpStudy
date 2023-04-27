/*
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1056 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.println(iVal1 != iVal2 ? 1 : 0) ;
    }

    public static void main(String[] args) throws IOException {
        CodeUp1056 c = new CodeUp1056();
        c.print();
    }
}
