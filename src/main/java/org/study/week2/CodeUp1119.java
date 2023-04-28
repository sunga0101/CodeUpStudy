/* 하루는 24시간.
일(day)이 입력으로 주어지면 시간으로 변환. */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1119 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iDay = scanner.nextInt();
        System.out.printf("%d", iDay*24 );
        }


    public static void main(String[] args) throws IOException {
        CodeUp1119 c = new CodeUp1119();
        c.print();
    }
}