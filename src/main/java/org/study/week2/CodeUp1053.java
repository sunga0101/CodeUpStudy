/*1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1053 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal= scanner.nextInt();
        System.out.println(iVal==1?0:1);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1053 c = new CodeUp1053();
        c.print();
    }
}
