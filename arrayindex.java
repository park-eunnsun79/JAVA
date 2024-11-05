package arrayindex;

import java.util.Scanner;  // Scanner 클래스를 import

public class arrayindex {

    public static void main(String[] args) {
        
        int num[] = new int[10];  // 크기가 10인 배열
        
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
        
        // 배열의 각 요소에 대해 정수 입력 받기
        System.out.println("배열에 10개의 정수를 입력하세요:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("nums[" + i + "] = ");
            num[i] = scanner.nextInt();  // 사용자로부터 정수 입력받기
        }
        
        // 홀수 인덱스만 출력
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0)  // 인덱스가 짝수일 경우 skip
                continue;
            System.out.println("nums[" + i + "] = " + num[i]);  // 홀수 인덱스 출력
        }

        scanner.close();  // Scanner 객체 닫기
    }
}

