/*
입력되는 시:분:초 에서 분만 출력해보자
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1026 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.next().split(":");
        int result = Integer.parseInt(strArr[1]);
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1026 c = new CodeUp1026();
        c.print();
    }
}
