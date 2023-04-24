/*
정수 1개를 입력받아 그대로 출력해보자.
단, 입력되는 정수의 범위는
-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1030 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        Long num = scanner.nextLong();
        System.out.println(num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1030 c = new CodeUp1030();
        c.print();
    }
}
