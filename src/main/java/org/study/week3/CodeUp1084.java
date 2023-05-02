/* 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자. */
package org.study.week3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iRed = sc.nextInt();
        int iGreen = sc.nextInt();
        int iBlue = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < iRed; i++) {
            for (int j = 0; j < iGreen; j++) {
                String line = "";
                for (int k = 0; k < iBlue; k++) {

                    line += i + " " + j + " " + k + "\n";
                    cnt++;
                }
                bw.write(line);
                bw.flush();
                // 시간 단축을 위해서 가장 안쪽 for문이 아닌 그 다음 for문에서 line 선언, write를 함
                // 반복 최소화
            }

        }
        System.out.println(cnt);
    }
}