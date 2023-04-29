/* 정수 계산에서 나머지를 구하시오 */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1121 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.println(iVal1%iVal2);
        }


    public static void main(String[] args) throws IOException {
        CodeUp1121 c = new CodeUp1121();
        c.print();
    }
}