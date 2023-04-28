/*
평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1069 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String sComment = scanner.next();

        switch (sComment) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }

    public static void main(String[] args) throws IOException {
        CodeUp1069 c = new CodeUp1069();
        c.print();
    }
}