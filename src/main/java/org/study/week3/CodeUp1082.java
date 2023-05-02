/* A, B, C, D, E, F 중 하나가 입력될 때,1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sHex = sc.next(); // 16진수 input
        int iDec = Integer.parseInt(sHex,16); // 16진수를 10진수로

        for (int i = 1; i < 16; i++) {
            System.out.printf("%s*%s=%s\n", sHex, Integer.toHexString(i).toUpperCase(), Integer.toHexString(i*iDec).toUpperCase());
        }

    }
}