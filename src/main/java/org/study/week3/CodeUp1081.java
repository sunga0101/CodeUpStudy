/* 숫자를 계속 더해 나갈 때,합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        for (int i = 1; i <= iVal1; i++) {
            for (int j = 1; j <= iVal2 ; j++) {
                System.out.printf("%d %d\n", i,j);
            }
        }
    }
}