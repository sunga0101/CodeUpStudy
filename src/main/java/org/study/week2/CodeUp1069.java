/*
평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1069 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iScore = scanner.nextInt();
        String res;
        if (iScore >= 90) {
            res = "A";
        } else if (iScore >= 70) {
            res = "B";
        } else if (iScore >= 40) {
            res = "C";
        } else {
            res = "D";
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1069 c = new CodeUp1069();
        c.print();
    }
}