package org.study.week4;

import java.util.Scanner;
public class CodeUp1087 {
    public void limit(int limit) {
        int sum=0;
        int cnt=0;
        while (sum<limit){
            cnt++;
            sum+=cnt;
        }
        System.out.println(sum); //
    }

    public static void main(String[] args) {
        CodeUp1087 cd = new CodeUp1087();
        Scanner sc = new Scanner(System.in);
        int iLimit = sc.nextInt();
        cd.limit(iLimit);
    }
}