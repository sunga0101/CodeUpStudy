/*
어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
*/
package org.study.week1;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1018 {
    public void print() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.printf("%s ", s);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1018 c = new CodeUp1018();
        c.print();
    }
}
