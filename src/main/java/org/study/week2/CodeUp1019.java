/*
년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.*/
package org.study.week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1019 {
    public void print() {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] str = date.split("\\.");

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        System.out.printf("%04d.%02d.%02d", year,month,day);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1019 c = new CodeUp1019();
        c.print();
    }
}
