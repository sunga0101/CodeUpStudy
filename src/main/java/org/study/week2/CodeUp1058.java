/*두 개의 참(1) 또는 거짓(0)이 입력될 때,모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1058 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        int iVal1= scanner.nextInt();
        int iVal2= scanner.nextInt();
        System.out.println(iVal1==iVal2 && iVal2==0 ? 1 : 0);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1058 c = new CodeUp1058();
        c.print();
    }
}
