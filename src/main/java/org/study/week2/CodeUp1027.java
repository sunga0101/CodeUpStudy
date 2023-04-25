/*
년월일(yyyy.mm.dd)를 입력받아, 일월년(dd-mm-yyyy)로 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1027 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String beforeBirth = scanner.next();
        String[] strArr = beforeBirth.split("\\.");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        CodeUp1027 c = new CodeUp1027();
        c.print();
    }
}
