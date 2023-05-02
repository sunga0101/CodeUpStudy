/* 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자. */
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
         String[] strArr = sc.nextLine().split(" ");
         for (int i=0;;i++){
             System.out.printf("%s\n",strArr[i]);
             if (strArr[i].equals("q"))
                 break;
         }
    }
}