/*단어를 한 줄에 하나씩 출력*/
package org.study.week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.printf("\'%s\'\n", word.charAt(i));
        }
    }
}