/* 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1077 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput = sc.nextInt();

        for (int i = 0; i<=iInput; i++) {
            System.out.println(i);
        }

    }
}