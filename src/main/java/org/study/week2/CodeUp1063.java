/*
입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자. 단, 3항 연산자 ? 를 사용.*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1063 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1= scanner.nextInt();
        int iVal2= scanner.nextInt();
        System.out.println(iVal1>iVal2 ? iVal1 : iVal2);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1063 c = new CodeUp1063();
        c.print();
    }
}
