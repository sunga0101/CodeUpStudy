/*
세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1066 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        int iVal3 = scanner.nextInt();

        //iVal1
        if (iVal1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //iVal2
        if (iVal2 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //iVal3
        if (iVal3 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }


    public static void main(String[] args) throws IOException {
        CodeUp1066 c = new CodeUp1066();
        c.print();
    }
}
