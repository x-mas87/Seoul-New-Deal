package Test;


import java.util.Scanner;

public class first {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("두개의 정수를 입력하세요:");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("합은 : " + (a+b));
    }


}
