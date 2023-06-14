package A0613;



//abstract class Car{
//    void run(){//추상클래스에 일반적인 메소드가 들어갈수있음
//        System.out.println("차가움직인다");
//    }
//    abstract void stop(); // 추상메소드(빈껍데기 함수) :일반적으로 이렇게 쓰임, 추상메소드는 추상클래스에만!
//    //추상메소드를 사용할려면 상속받아서 자식클래스에서 사용한다.그래서 부모클래스에만 추상메소드가 있다.
//    class Cars extends Car{
//        Cars(){
//            name = "인피니티";
//        }
//        void stop(){//오버라이딩(재정의)
//            System.out.println("차가 멈춘다");
//        }
//    }
//}

//class Cal{
//    static int add(int a , int b){
//        return a+b;
//    }
//    static int div(int a , int b){
//        return a/b;
//    }
//}

//class Music {
//    String title;
//    String singer;
//
//    Music(String a, String b){
//        title = a;
//        singer = b;
//    }
//    Music(String a){
//        this(a,"방탄");//다른 생성자 호출하는 this 기능 (꼭 기억!!!)
//
//    }
//
//}

//class Person{
//    String name;
//
//    Person(String name){
//        this.name = name;
//    }
//}
//class Student extends Person{
//    Student(String name){
//        super(name);//부모생성자 호출
//    }
//}

//class Circle{
//    int r;
//
//    Circle(int r){
//        this.r = r;
//    }
//    double area(){
//        return r*r*3.14;
//    }
//}


//import java.util.Scanner;
//class Score{
//    int sum = 0;
//    void show(int a[][]){
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                sum += a[i][j];
//
//            }
//
//        }
//        System.out.println(sum/12.0);
//    }
//}

import java.util.Scanner;

//class AAA{
//    void ride() {
//        System.out.println("오버라이딩 AAA");
//    }
//    void load() {//오버로딩 : 함수의 매개변수
//        System.out.println("오버로딩 AAA");
//    }
//}
//class BBB{
//    void ride() {
//        System.out.println("오버라이딩 BBB");
//    }
//    void load(int n) {
//        System.out.println("오버로딩 BBB");
//    }
//
//}


//   private int age ;
//   private String name;
//
//     Profile(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
//    void show(){//메소드
//        System.out.println(age + " " + name);
//    }

    //1.출력을 어디에서 할건지
    //
    //2.main에서 할거면 함수에서 리턴
    //
    //-> 함수호출과 동시에 출력
    //
    //-> 변수를 주면서 리턴값을 저장할 것인지
    //
    //2.1 함수에서 할거면 리턴문 필요없음
    //
    //(void)
//    static double area(double r){
//        return r * r * 3.14;
//    }
//    static double round(double r){
//        return 2 * r * 3.14;
//    }
//
//    static void total(int a, int b){
//        int sum = 0;
//        for (int i = a; i <=b; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }

//    static int big(int a , int b){
//        return a > b ? a : b;
//
//    }

//    static int big(int a[]){
//        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            if(max < a[i]){
//                max = a[i];
//            }
//
//
//        }
//        return max;// int 반환형이기 때문에 return 이 있어야함
//    }
//class Num extends Exception{//상속
//    Num(){
//        super("잘못된 값!!!!!!");//Exception(부모) 생성자 호출
//    }
//
//}


public class A0613 {
//    static int in()throws Num{
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//
//        if (n<0){
//            Num num = new Num();//생성자 호출
//            throw num;//예외 던지기(예외 미루기) 객체를 이용해서 쓸때는 throw, 함수에서 쓸때는 throws
//        }
//        return n;
//    }
    public static void main(String[] args) {


//        System.out.println("양수  입력");
//        try {
//            int n = in();
//            System.out.println(n);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }




//----------------------------------------------------
//        Scanner rd = new Scanner(System.in);
//        int divisor = 0;
//        int dividend = 0;
//
//        System.out.print("나뉨수를 입력하시오:");
//        dividend = rd.nextInt();
//        System.out.print("나눗수를 입력하시오:");
//        divisor = rd.nextInt();
//        System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");

        //추상 클래스로는 객체 생성 불가능
//        Cars c = new Cars();
//        c.run();
//        c.stop();


//-------------------------------------------------------------------
//        int a = Cal.add(10,5); //합 > 객체 생성없이 클래스로부터 직접접근가능 static
//        int b = Cal.div(10,5); //몫
//        System.out.println(a + " " + b);

//-----------------------------------------------------------------
//        Music m=new Music("On", "BTS");
//        System.out.println(m.title+ " " +m.singer); // On , BTS 출력
//
//        Music m1=new Music("Butter");
//
//        System.out.println(m1.title+" " +m1.singer);

        //-----------------업캐스팅 다운캐스팅-------------------
//        Person p = new Student("길동"); // upcating 발생
//
//        Student s = (Student)p ;//downcasting
//        System.out.println(s.name);//downcasting

//------------------------------------------------------------------------
//        Circle [] ary = new Circle[4];//객체 배열 생성 int [] ary = new int[4]
//
//        for (int i = 0; i < ary.length; i++) {
//            ary[i] = new Circle(i); // 객체생성 코드
//            //객체 4개를 생성해서 배열 위치에 저장
//            System.out.println(ary[i].area());
//
//        }

        //-----------------------------------------------

//        int [][] grade= {{90,100,80},
//                {70,95,87},
//                {80,90,70},
//                {90,100,100}};
//
//        Score s = new Score();
//        s.show(grade); //이차원 배열의 평균출력

//        AAA a=new AAA(); //객체 생성
//        a.ride();
//        a.load();
//
//        BBB b=new BBB();
//        b.ride();
//        b.load(10);


        //오버라이딩 vs 오버로딩



        //-------------------------------------------------

//        Profile p1 = new Profile(22, "혜린");
//
//        p1.show();




//---------------------------------------------------------------------------------
//        Scanner s = new Scanner(System.in);
//        int a[] = new int[7];
//
//        for (int i = 0; i < a.length; i++) {//7개 정수 중 제일 큰 값 출력
//            a[i] = s.nextInt();
//
//        }
//        System.out.println(big(a));// main 메소드에서 출력을 해주기때문에, int반환형으로



//----------------------------------------------------------------
//        Scanner s=new Scanner(System.in);
//
//        int c=s.nextInt();
//        int d=s.nextInt();
//
//        System.out.println(big(c,d));
//--------------------------------------------------------------
//        total(1,10);
//        total(1,100 );
//--------------------------------------------------------------
//        System.out.println("원의넓이 : " + area(5.5));
//        System.out.println("원의둘레 : " + round(3.2));

        //3행 4열의 정수형 배열을 생성하여 0~9 범위의 정수를 랜덤하게 저장한다.
        //저장 후 2차원 배열과 합을 출력해라.
//        int a[][] = new int [3][4];
//        int sum=0;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//
//                a[i][j] = (int)(Math.random()*10);
//                System.out.print(a[i][j] + " ");
//                sum += a[i][j];
//            }
//            System.out.println();
//        }
//        System.out.println("합은" + sum);




        //0~30 수 중에서 5의배수를 제외하고 출력해라.
        //무한 반복문과 break, continue를 다 사용하여 출력)

//        int n = -1;
//        while (true) {
//            n++;
//            if (n % 5 == 0 && n != 0) {
//                continue;
//            }
//
//            if (n > 30) {
//                break;
//            }
//
//            System.out.println(n);
//
//        }
    }

}
