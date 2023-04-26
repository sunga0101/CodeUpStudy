/*

*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1044 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        long iVal = scanner.nextLong();


        System.out.printf("%d",++iVal );
    }

    public static void main(String[] args) throws IOException {
        CodeUp1044 c = new CodeUp1044();
        c.print();
    }
}
