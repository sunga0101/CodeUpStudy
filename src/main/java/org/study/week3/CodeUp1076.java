/* 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
 */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char cInput = sc.next().charAt(0);

        for (char c = 'a'; c != cInput; c++) {
            System.out.printf("%c ",c);
        }
        System.out.printf("%c", cInput);
    }
}