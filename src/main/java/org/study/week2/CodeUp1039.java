/*
정수 2개를 입력받아 합을 출력해보자.
단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1039 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long result = num1+num2;
        System.out.println(result );
    }

    public static void main(String[] args) throws IOException {
        CodeUp1039 c = new CodeUp1039();
        c.print();
    }
}
