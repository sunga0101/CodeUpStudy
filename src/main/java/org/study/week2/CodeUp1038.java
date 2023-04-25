/*
정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1038 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long result = num1+num2;
        System.out.println(result );
    }

    public static void main(String[] args) throws IOException {
        CodeUp1038 c = new CodeUp1038();
        c.print();
    }
}
