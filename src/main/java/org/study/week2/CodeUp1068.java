/*
점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1068 {
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
        CodeUp1068 c = new CodeUp1068();
        c.print();
    }
}