/*
문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
변수에 저장되어 있는 문자를 그대로 출력해보자.

*/
package org.study.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1011 {
    public void print() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.printf("%c",is.read());
    }

    public static void main(String[] args) throws IOException {
        CodeUp1011 c = new CodeUp1011();
        c.print();
    }
}