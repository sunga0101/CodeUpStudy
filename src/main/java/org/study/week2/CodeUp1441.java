/* 버블소팅 */
package org.study.week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1441 {
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp;
    }
    public void print(int[] iArr) {
        for(int i=0; i< iArr.length; i++){
            System.out.println(iArr[i]);
        }

    }
    public static void main(String[] args) throws IOException {
        CodeUp1441 codeUp1441 = new CodeUp1441();
        Scanner scanner = new Scanner(System.in);
        int iLen =scanner.nextInt(); // 배열 길이 입력

        int[] intArr = new int[iLen];
        for (int i=0; i<iLen; i++) { // 배열 값 입력
            intArr[i]= scanner.nextInt();
        }
        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j]>intArr[j+1]){
                    swap(intArr, j, j+1);
                }
            }
        }
        codeUp1441.print(intArr);
    }

}