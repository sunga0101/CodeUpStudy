/*
실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
저장되어 있는 실수값을 출력해보자.
*/
package org.study.week1;

import java.util.Scanner;

public class CodeUp1012 {
    public void printNum() {
        Scanner sc = new Scanner(System.in);
        float n =  sc.nextFloat();
        System.out.printf("%f",n);
    }

    public static void main(String[] args) {
        CodeUp1012 c = new CodeUp1012();
        c.printNum();
    }
}