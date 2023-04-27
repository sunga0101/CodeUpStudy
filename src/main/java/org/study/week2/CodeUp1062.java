/*
입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1062 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1= scanner.nextInt();
        int iVal2= scanner.nextInt();
        System.out.println(iVal1^iVal2);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1062 c = new CodeUp1062();
        c.print();
    }
}
