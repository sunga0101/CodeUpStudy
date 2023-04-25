/*

*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1040 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        System.out.println(-num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1040 c = new CodeUp1040();
        c.print();
    }
}
