/* 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자 */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1074 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput = sc.nextInt();

        for (int i = iInput; i > 0; i--) {
            System.out.println(i);
        }

    }
}