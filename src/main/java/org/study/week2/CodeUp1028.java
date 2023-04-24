/*
정수 1개를 입력받아 그대로 출력해보자.
(단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1028 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        Long num = scanner.nextLong();
        System.out.println(num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1028 c = new CodeUp1028();
        c.print();
    }
}
