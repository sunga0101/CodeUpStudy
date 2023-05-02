/* 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput = sc.nextInt();
        for (int i = 0; iInput != 0; i++) {
            System.out.println(iInput); // 7 출력 , 4 출력
            iInput = sc.nextInt(); // 4 받음 , 2받음
        }

    }
}