/*
정수(int) 2개를 입력받아 그대로 출력해보자.
*/
package org.study.week1;

import java.util.Scanner;

public class CodeUp1013 {
    public void printAB() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d", a,b);
    }

    public static void main(String[] args) {
        CodeUp1013 c = new CodeUp1013();
        c.printAB();
    }
}