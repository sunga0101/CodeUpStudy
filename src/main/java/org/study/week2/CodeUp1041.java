/*
영문자 1개를 입력받아 그 다음 문자를 출력해보자.
영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1041 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int res = (int)scanner.next().charAt(0)+1;
        System.out.println( (char)res);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1041 c = new CodeUp1041();
        c.print();
    }
}
