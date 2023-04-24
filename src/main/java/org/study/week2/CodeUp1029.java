/*
실수 1개를 입력받아 그대로 출력해보자.
(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1029 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        System.out.printf("%.11f",num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1029 c = new CodeUp1029();
        c.print();
    }
}
