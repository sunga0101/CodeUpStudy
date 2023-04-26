/*
정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1042 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iFirst = scanner.nextInt();
        int iSecond = scanner.nextInt();
        System.out.println( iFirst/iSecond);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1042 c = new CodeUp1042();
        c.print();
    }
}
