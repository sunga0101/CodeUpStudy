/*
주민번호는 다음과 같이 구성된다.
XXXXXX-XXXXXXX
앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
주민번호를 입력받아 형태를 바꿔 출력해보자.
*/
package org.study.week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1020 {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        // .substring을 이용한 방법
        String frontPart = id.substring(0,6);
        String backPart = id.substring(7);
        System.out.println(frontPart+backPart);

        //.split을 이용한 방법
//        String[] arr = id.split("-");
//        System.out.println(arr[0] + arr[1]);
    }

    public static void main(String[] args) throws IOException {
        CodeUp1020 c = new CodeUp1020();
        c.print();
    }
}
