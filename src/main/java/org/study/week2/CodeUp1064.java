/*
입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자. 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1064 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1= scanner.nextInt();
        int iVal2= scanner.nextInt();
        int iVal3= scanner.nextInt();
        // 변수 사용
        //int min = (iVal1<iVal2 ? iVal1 : iVal2);
        //System.out.println(min<iVal3 ? min : iVal3);

        //중첩 사용
        int result = (iVal1 < iVal2 ? iVal1 : iVal2 ) < iVal3 ? ( iVal1 < iVal2 ? iVal1 : iVal2 ) : iVal3;
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1064 c = new CodeUp1064();
        c.print();
    }
}
