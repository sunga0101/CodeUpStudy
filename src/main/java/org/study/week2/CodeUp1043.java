/*
정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
단, 0 <= a, b <= +2147483647, b는 0이 아니다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1043 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iFirst = scanner.nextInt();
        int iSecond = scanner.nextInt();
        System.out.println( iFirst%iSecond);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1043 c = new CodeUp1043();
        c.print();
    }
}
