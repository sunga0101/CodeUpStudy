/*
2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자
*/
package org.study.week1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1014 {
    public void print() throws IOException {
        Scanner sc = new Scanner(System.in);
        char first = sc.next().charAt(0);
        char second = sc.next().charAt(0);
        System.out.printf("%c %c", second,first);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1014 c = new CodeUp1014();
        c.print();
    }
}