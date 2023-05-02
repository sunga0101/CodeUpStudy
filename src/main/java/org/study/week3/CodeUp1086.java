/* A, B, C, D, E, F 중 하나가 입력될 때,1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int iBit = sc.nextInt();
        long data = (long) width * height * iBit;
        float result = data / 1024.0f / 1024.0f / 8 ;
        System.out.printf("%.2f MB",result);

    }
}