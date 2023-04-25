/*
10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
단, 0 ~ 255 범위의 정수만 입력된다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1037 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println((char) num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1037 c = new CodeUp1037();
        c.print();
    }
}
