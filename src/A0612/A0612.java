package A0612;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class A0612 {

    public static void main(String[] args) {

        String str = "오늘은 월요일, 공부하고 티비를 본다";
        String a = str.substring(4,7);
        System.out.println(a);

        String b = str.replace("공부","study");
        System.out.println(b);

        String c = str.concat(" 내일은 화요일");
        System.out.println(c);


//
//        String []a = str.split(",");
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//
//        for (String b :
//                a) {
//            System.out.println(b);
//        }

//        String s[][] = {{"java"},{"c","c++"},{"html","css","js"}};
//
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; j < s[i].length; j++) {
//                System.out.print(s[i][j]);
//            }
//            System.out.println();
//        }

//        //하나의 문자 5행 5열 구조
//        char d[][] = new char[5][5];
//
//        //실수형 5행 2열 구조
//        double b[][] = new double[5][2];
//
//        int [][] c = {{1,2,3},{4,5,6}};//2행 3열
//
//        //2차원배열일떄
//        //행 : -> 배열명.length
//        //열 : -> 배열명[행].length
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c[i].length; j++) {
//                System.out.println(c[i][j]);
//            }
//
//        }


        //for-each문 활용
//        int sum = 0;
//        int ary[] = {1, 2, 3, 4, 5};
//        for (int i :
//                ary) {
//            sum += i;
//        }
//        System.out.println(sum);


//        Scanner s = new Scanner(System.in);
//
//        //정수5개 들어갈수 있는 배열 생성
//        int ary[] = new int[5];
//        int max = 0;
//
//        //정수5개를 입력해서 제일 큰 값을 출력(배열)
//        for (int i = 0; i < ary.length; i++) {
//            ary[i] = s.nextInt(); // ary[0],ary[1],ary[2] ~ art[4]
//            if (max < ary[i]){
//                max = ary[i];
//            }
//
//        }
//        System.out.println("가장 큰수는" + max);


//        Scanner s = new Scanner(System.in);
//        double ary[] = new double[3];
//        //배열 선언        배열 생성
//
//        for (int i = 0; i < 3; i++) {
//            ary[i] =s.nextDouble();//실수3회입력
//            System.out.println(ary[i]);
//        }


//        //1. 정수 5개를 저장할 배열
//        int a[] = new int[5];
//
//        //2 10개 저장하는 배열
//        int d[] = new int[10];
//
//        //3. 실수 10ㄱ ㅐ 저장할 배열
//        double [] b = new double[10];
//
//        //4.배열 요소 수가 세개인 int형 배열
//        int c[] = new int[3];
//
//        //인덱스의 최대값이 4인 char 형 배열
//        char e[] =new char[5];


        // 1.	5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)

//        double res = 5.0 / 3.0;
//        System.out.printf("%.2f\n", res);

        //2.	키(double)를 하나 입력받아 160보다 작으면
        // “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
//        Scanner s = new Scanner(System.in);
//        System.out.println("당신의 키는 몇인가요?");
//        double height = s.nextDouble();
//
//        if (160 > height) {
//            System.out.println("small");
//        } else if (170 > height) {
//            System.out.println("medium");
//        } else if (180 > height) {
//            System.out.println("large");
//
//        }

        //3.	n1을 50, n2를 100으로 초기화하여 두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
//        int n1 = 50, n2 = 100;
//        int max = (n1 > n2) ? n1 : n2;
//        System.out.println("두 수 중 큰 수는: " + max);

        //4.	나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
//        Scanner s = new Scanner(System.in);
//        System.out.println("나이입력 : ");
//        int age = s.nextInt();
//        int height = 0;
//        String size = "";
//
//        if (age >= 20) {
//            if (height < 160) {
//                System.out.println(size + ":S");
//            } else if (height >= 165 && height < 175) {
//                System.out.println(size + ":M");
//            } else {
//                System.out.println(size + ":L");
//            }
//        } else {
//            if (height < 160) {
//                System.out.println(size + ":S");
//            } else if (height >= 160 && height < 170) {
//                System.out.println(size + ":M");
//            } else {
//                System.out.println(size + ":L");
//            }
//        }

        //5.	1부터 50까지의 정수를 출력해라.(for)
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(i);
//        }
//
        //1~50 정수 중 6의 배수를 출력해라.(for, if)
//         for (int i = 1; i <= 50; i++) {
//        if (i % 6 == 0) {
//            System.out.println(i);
//        }
//    }

        //1~50까지의 총합 출력해라
//        int sum = 0;
//        for (int i = 1; i <= 50; i++) {
//            sum += i;
//        }
//        System.out.println("총합은: " + sum);

        //1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.

        //import java.util.Random;
//        Random random = new Random();
//        int randomNumber = random.nextInt(50) + 1;
//        System.out.println("1~50에서 무작위 난수: " + randomNumber);
//
//        //6.	a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다.
//        //+이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
//
//        int a = 10;
//        int b = 20;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("연산자(+,-,*,/)중 하나를 입력하세요: ");
//        char operator = scanner.next().charAt(0);
//
//        int result;
//
//        switch (operator) {
//            case '+':
//                result = a + b;
//                System.out.println("합은: " + result);
//                break;
//            case '-':
//                result = a - b;
//                System.out.println("빼기는: " + result);
//                break;
//            case '*':
//                result = a * b;
//                System.out.println("곱하기는: " + result);
//                break;
//            case '/':
//                result = a / b;
//                System.out.println("나누기는: " + result);
//                break;
//            default:
//                System.out.println("없는 연산자입니다.");
//        }


//        Scanner s = new Scanner(System.in);
//        System.out.println("문자 한개 입력");
//
//        char c = s.next().charAt(0); // c입력 -> 99
//        int n = (int)c; //99 (정수 강제 타입변환)
//        System.out.println(n);
//
//        for (int i = 97; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                char ch = (char)j;
//                System.out.print(ch);
//            }
//            System.out.println();
//        }


        //do-while

//        String str;
//        Scanner s = new Scanner(System.in);
//
//        do {
//            System.out.println("문자열 입력");
//            str = s.next();
//
//            if (str.equals("exit")){
//                System.out.println("프로그램 종료");
//            }
//            else {
//                System.out.println(str);
//            }
//
//        }while (!str.equals("exit"));

//        Scanner s = new Scanner(System.in);
//        System.out.println("정수 5개 입력");
//
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            int n = s.nextInt();
//
//            if (n<0){
//                continue;//제외(올라가서 반복문 다시 수행)
//            }
//            else {
//                sum += n;
//            }
//        }
//        System.out.println(sum);


        //많이 쓰이는 표현식
//        while (true){
//            int n = (int)(Math.random()*6)+1;
//
//            if (n == 6){
//                break;
//            }
//            else {
//                System.out.println(n);
//            }
//        }

//        Scanner s = new Scanner(System.in);
//
//        while (true){
//            //무한루프 멈춤 제어문자 > break
//            System.out.println("이름 입력");
//            String name = s.next();
//
//            if (name.equals("성탄")){
//                break;
//            }
//            System.out.println(name);
//        }

//        int sum = 0, n = 100;
//        Scanner s = new Scanner(System.in);
//
//        while (n!=0){//0이 아닐때 까지, true가 들어가면 무한 루프 돌게됨
//            System.out.println("입력해라");
//            n = s.nextInt();
//            sum += n;
//
//            System.out.println(sum);
//        }

        //중첩 for문
//        for (int i = 2; i < 9; i++) {//행
//            for (int j = 1; j <=9; j++) {//열
//                System.out.print(i + "*" + j + "="+ i*j + " ");
//
//            }
//            System.out.println();
//        }

        //WHILE문 : 초기문, 조건문, 증감문
//        int i =1 ;
//        while (i<=99){
//            if (i%2 ==0 || i%3 ==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        Scanner s = new Scanner(System.in);
//        System.out.println("정수 입력");
//        int n = s.nextInt();
//
//        //2*1 = 2 2*2 =4 구구단 출력
//        switch (n) {
//            case 2:
//                System.out.println("2단");
//                for (int i = 1; i <= 9; i++) {
//
//                    System.out.print(2 * i);
//                }
//                break;
//            case 3:
//                System.out.println("3단");
//                for (int i = 1; i <= 9; i++) {
//
//                    System.out.print(3 * i);
//                }
//                break;
//
//            default:
//                System.out.println("잘못입력");
//                break;
//        }


        //for문 : 초기식, 조건식, 증감

//        for (int i = 1; i <=15; i++) {
//            System.out.print("*");
//            if(i%5 == 0){
//                System.out.println();
//            }
//
//        }

        //총합구하기
//        int sum = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 == 0) {//짝수이면
//                sum += i ; // sum = sum+i
//            }
//        }
//        System.out.println(sum);

        //1부터100사이에서 30배수 출력
//        for (int i = 1; i<100; i++){//전제조건
//            if(i%5 ==0 && i%6 ==0){//30배수 출력
//                System.out.println(i);
//            }
//        }


//        int n = (int) (Math.random() * 100) + 1;//1~100이하
//        //int n = (int) (Math.random() * 51) + 50;//1~100이하(동일함, 많이 쓰임)
//        //int n = (int) (Math.random() * 9) + 4;//4~12이하(알고리즘 문제출제)
//        System.out.println(n);
//        if (n % 5 == 0) { //5를 나눳을떄 나머지가 0이면
//            System.out.println("n은 5의배수이다");
//        } else if (n % 10 == 0) {
//            System.out.println("n은 10의 배수이다");
//        } else
//            System.out.println("위조건 둘다아님");
        //0.0 *100 + 1 <= random() *100 +1 <1.0*100 +1
        //1 <=  < 101


        //switch case값(상수:문자 문자열 정수) 상수만 올수있음
//        Scanner s = new Scanner(System.in);
//        System.out.println("무슨 요일이야?");

        //String day = s.next();
        //char day = s.next().charAt(0); //한글자 입력받기


//        String day = s.next();
//
//        switch (day){
//            case "월요일":
//                System.out.println("월");
//                break;
//
//            case "화요일":
//                System.out.println("화");
//                break;
//
//            default://else랑 같다 보면 됨
//                System.out.println("월, 화 아님");
//                break;
//        }

        //중첩 if문
//        Scanner s = new Scanner(System.in);
//        System.out.println("점수입력 : ");
//        int score = s.nextInt();
//
//        System.out.println("학년 입력: ");
//        int year = s.nextInt();
//
//        if (score >= 60) {
//            if (year != 4) {
//                System.out.println("합격");//score는 60점이상이면서 4학년이 아닐떄
//            }
//            else if (score >= 70) {//4학년 이면서 score가 70점 이상일떄
//                System.out.println("합격");
//            }
//            else {//4학년이 70점 미만이면
//                System.out.println("불합격");
//            }
//        }
//        else {
//            System.out.println("불합격");
//        }

        //삼항조건 연산자
//        int score = 85;
//        char grade = (score>90)?'A' : 'B';
//
//        System.out.println(grade);


//        Scanner s = new Scanner(System.in);
//        System.out.println("점수입력");
//        int grade = s.nextInt();
//        char score;//변수선언(하나의 문자 - 기본데이터타입)
//
//        if (grade >= 90)
//            score = 'A';
//        else if (grade >=80)
//            score = 'B';
//        else if (grade >=70)
//            score = 'C';
//        else
//            score = 'F';
//        System.out.println("학점 : " + score);

//        int a = 10, b = 4;
//        if (a == 10) {
//            System.out.println("A");
//        }
//        else if (a < b) {
//            System.out.println("B");
//        }
//        else if (a > b) {
//            System.out.println("C");
//        }


        //4.	Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
//        System.out.println("입력해라 : kim seoul 29 65.5");
//        Scanner s = new Scanner(System.in);// 스캐너 클래스의 객체 생성
//        String name = s.next();
//        String address = s.next();
//        int age = s.nextInt();
//        Double weigh = s.nextDouble();
//        System.out.println("내 이름은" + name + " 사는 곳은" + address +"이고," +"나이는" + age +
//                "살이다." + "몸무게는" + weigh +"이다.");


        // 3.	a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라.
        //실행 결과) 4.0+1.2=5.2
//        double a = 4.0, b = 1.2;
//
//        System.out.printf("%.1f", (a + b));


        //2.    하나의 정수를 입력받아 그 수의 제곱을 구해라.
//        System.out.println("하나의 정수를 입력하세요");
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println(a*a);

        //1.	10/4 한 결과값을 소수점까지 출력해라
//        int a = 10, b = 4;
//        int result = 0;
//        System.out.println(Double)(a/b);


//        System.out.println("이름이 뭐예요");
//        Scanner s = new Scanner(System.in);// 스캐너 클래스의 객체 생성
//        String name = s.next();
//        System.out.println(name);

//        int a = 5 , b;
//        b = a++; //대입 후 1증가(후위 연산자)
//        System.out.println(a);
//        System.out.println(b);

//        b = ++a; //1증가 후 대입(전위 연산자)
//        System.out.println(b);
//        System.out.println(a);

//        int age = 30;
//        double ki = 177.7;
//        String name = "jack";
//        char grade = 'A';
//
//        System.out.println(age + " " + ki + " " + name + " " + grade);
        //변수 : 변할수도 있는 값
        //변수 선언
        //자료형 변수명
        // = : 대입연산자
    }
}