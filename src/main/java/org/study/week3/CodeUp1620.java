/*어떤 수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 될때까지 계산하여 출력하시오.*/
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1620 {

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (num == 0 && sum >= 10) { // 연산할 수가 두자리를 넘어가면 루프 계속
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        System.out.println(digitSum(iVal));
    }
}