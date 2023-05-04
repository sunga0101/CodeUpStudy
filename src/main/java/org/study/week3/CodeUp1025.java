/*다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.*/
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] splitN = sc.next().split("");
        int nValue;

        for (int i = 0; i < splitN.length; i++) {
            nValue = Integer.parseInt(splitN[i]);
            nValue *= Math.pow(10, splitN.length-1-i);
            System.out.printf("[%d]\n",nValue);
        }
    }
}