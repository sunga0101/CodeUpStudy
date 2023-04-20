/*
정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
변수에 저장되어 있는 값을 그대로 출력해보자.
*/
package org.study.week1;

import java.util.Scanner;

public class CodeUp1010 {
    public void printNum() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d",sc.nextInt());
    }

    public static void main(String[] args) {
        CodeUp1010 c = new CodeUp1010();
        c.printNum();
    }
}