package A0613;

import java.util.Scanner;

class PhoneNum{
    //멤버 변수 이름, 번호 선언해주고
    String name;
    String phone;

    //생성자(인자2개) 만들어주고 멤버변수에 인자 값 대입
    PhoneNum(String n, String p){
        name =n;
        phone =p;
    }
    void show(){
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phone);
    }
}
class School extends PhoneNum{

    String major;

    School(String n, String p, String major){

        super(n,p);
        this.major = major;
    }
    void  show(){//오버라이딩
        super.show();
        System.out.println("전공 : " + major);
    }
}
class Worker extends PhoneNum{
    String grade;

    Worker(String n, String p, String g){
        super(n,p);
        grade = g;
    }
    void  show(){//오버라이딩
        super.show();
        System.out.println("직급 : " + grade);
    }
}
class Arr{
    PhoneNum [] ary;//객체 배열 선언
    int n;
    
    Arr(int n){
        ary = new PhoneNum[n]; //배열 생성코드(생성자안에 배열생성코드를 많이 쓰기 때문에 선언부분은 멤버에
        //넣고 분리했음
        n = 0;
    }

    void add(PhoneNum p){

        ary[n++] = p; //친구추가
    }
    
    //친구정보등록
    void friend(char ch){
        Scanner s = new Scanner(System.in);
        System.out.println("이름 :");
        String name = s.next();

        System.out.println("번호 : ");
        String num = s.next();

        switch (ch){
            case 'A':
                System.out.println("전공 : ");
                String major = s.next();

                //PhoneNum p = new School(name,num,major)
                add(new School(name,num,major));
                break;
            case 'B':
                System.out.println("직급 : ");
                String grade = s.next();

                //PhoneNum p = new School(name,num,major)
                add(new Worker(name,num,grade));
                break;
                
        }

    }
    void all(){
        //n은 배열의 길이
        for (int i = 0; i < n; i++) {
            ary[i].show();
        }
    }
}


public class Prac6 {
    public static void main(String [] args){

        Arr ar = new Arr(3);
        
        while (true){
            System.out.println("A, 학교 친구 정보");
            System.out.println("B, 직장 동료 정보");
            System.out.println("C, 종료");
            System.out.println("D, 출력");
            System.out.println("문자 입력");
            Scanner s = new Scanner(System.in);
            char c= s.next().charAt(0);
            switch (c){
                case 'A':
                    ar.friend(c);
                    break;
                case 'B':
                    ar.friend(c);
                    break;
                case 'C':
                    System.out.println("종료");
                    return;
                case 'D':
                    ar.all();
            }
        }
    }

}
