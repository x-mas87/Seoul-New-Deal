package A0614;

import java.util.Scanner;

class Grade {
    private int english;
    private int math;
    private int science;

    public Grade() {
    }

    public Grade(int english, int math, int science) {
        this.english = english;
        this.math = math;
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public double CalcAverage() {
         return (english + math + science) / 3.0;

    }
}

public class Prac6 {
    public static void main(String[] args) {

        Grade g = new Grade();
        Grade g1 = new Grade(90,85,95);


        System.out.println("g영어 점수: " + g.getEnglish());
        System.out.println("g수학 점수: " + g.getMath());
        System.out.println("g과학 점수: " + g.getScience());
        System.out.println("g 세 과목의 평균값: " + g.CalcAverage());

        System.out.println();

        System.out.println("g1영어 점수: " + g1.getEnglish());
        System.out.println("g1수학 점수: " + g1.getMath());
        System.out.println("g1과학 점수: " + g1.getScience());
        System.out.println("g1 세 과목의 평균값: " + g1.CalcAverage());


    }
}
