/*
정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1067 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal = scanner.nextInt();
        if (iVal > 0){
            System.out.println("plus");
        }
        else {
            System.out.println("minus");
        }
        if (iVal % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) throws IOException {
        CodeUp1067 c = new CodeUp1067();
        c.print();
    }
}