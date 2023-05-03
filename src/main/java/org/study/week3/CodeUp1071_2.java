/*0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.*/
package org.study.week3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1071_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int iInput;

        do {
            iInput = sc.nextInt();
            if (iInput !=0)
            System.out.println(iInput);
        }
         while (iInput != 0);



    }
}
