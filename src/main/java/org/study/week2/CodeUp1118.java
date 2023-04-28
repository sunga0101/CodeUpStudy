/*
삼각형의 넓이를 구하는 프로그램을 작성한다. 입력(정수) : 밑변 높이 출력 : 넓이 소수 첫째자리 */
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1118 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();

        System.out.printf("%.1f", (iVal1*1.0)*(iVal2*1.0)/2 );
        }


    public static void main(String[] args) throws IOException {
        CodeUp1118 c = new CodeUp1118();
        c.print();
    }
}