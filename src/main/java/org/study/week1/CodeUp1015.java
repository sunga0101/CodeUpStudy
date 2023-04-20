/*
실수(float) 1개를 입력받아 저장한 후,
저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
소수점 이하 둘 째 자리까지 출력하시오.
*/
package org.study.week1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1015 {
    public void print() {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.printf("%.2f", num);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1015 c = new CodeUp1015();
        c.print();
    }
}