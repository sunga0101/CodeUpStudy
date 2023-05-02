/* 숫자를 계속 더해 나갈 때,합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput = sc.nextInt();
        int sum = 0;
        int res = 0;
        for (int i = 1; sum < iInput; i++) {
            sum += i;
            res = i;
        }
        System.out.println(res);
    }
}