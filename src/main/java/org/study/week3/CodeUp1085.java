/* 녹음할 시간 s가 주어질 때,
필요한 저장 용량을 계산하는 프로그램을 작성. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iHz = sc.nextInt();
        int iBit = sc.nextInt();
        int iCh = sc.nextInt();
        int iSec = sc.nextInt();
        long res = ((long) iHz * iBit * iCh * iSec);
        double result = res / 1024.0f / 1024.0f / 8.0f ;  // bit를 단위를 나눔
        System.out.printf("%.1f MB", result);

    }
}