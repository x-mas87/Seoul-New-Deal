package A0614;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);//코테때는 BufferedReader로 입력받아야함 

        System.out.println("배열의 크기를 입력하세요: ");
        int size = s.nextInt();

        int[] scores = new int[size];

        // 성적 배열에 랜덤 값을 저장
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int)(Math.random() * 101);
            // 0부터 100 사이의 랜덤 값, (math)(random)으로 입력받아 score[i]에 넣어줌
        }

        // 성적 배열 출력
        System.out.println("성적 :");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
    }
}