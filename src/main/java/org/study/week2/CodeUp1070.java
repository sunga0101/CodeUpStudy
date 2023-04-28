/*
월이 입력될 때 계절 이름이 출력되도록 해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1070 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iMonth = scanner.nextInt();

        switch (iMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println(" ");
        }
    }

    public static void main(String[] args) throws IOException {
        CodeUp1070 c = new CodeUp1070();
        c.print();
    }
}