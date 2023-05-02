/*n개의 입력된 정수를 순서대로 출력해보자.*/
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iCount = sc.nextInt();
        for (int i = 0; i<iCount ; i++) {
            System.out.println( sc.nextInt());
        }

    }
}
