/* 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 1; i <= iVal; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.printf("%s ", "X");


            } else {
                System.out.printf("%d ", i);
            }

        }
    }
}