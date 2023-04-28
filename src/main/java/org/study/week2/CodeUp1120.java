/* 세 정수가 입력되면 평균을 출력하시오. */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1120 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();

        System.out.printf("%.2f", (sum*1.0)/3 );
        }


    public static void main(String[] args) throws IOException {
        CodeUp1120 c = new CodeUp1120();
        c.print();
    }
}