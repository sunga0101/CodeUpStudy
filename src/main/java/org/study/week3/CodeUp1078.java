/* 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
 */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= iInput ; i++ ) {
            if (i%2==0) { //짝수
                sum += i;
            }
        }
        System.out.println(sum);

    }
}