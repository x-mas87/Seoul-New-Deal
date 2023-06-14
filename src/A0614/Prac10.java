package A0614;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    public boolean equals(Object obj) {

        Person p = (Person) obj;//다운캐스팅

        if (p.getId() == this.id && p.getName().equals(this.name)) {
            return true;
        }
        return false;
    }
}

class Game {
    Scanner s = new Scanner(System.in);

    ArrayList<Person> a = new ArrayList<Person>(5);//allaylist의 갯수는 5개

    public Game() {
        a.add(new Person("민준", 123));
        a.add(new Person("성준", 456));
        a.add(new Person("석준", 567));
        a.add(new Person("희준", 678));

    }

    void in() {
        while (true) {
            System.out.println("이름, id입력");
            String name = s.next();

            if (name.equals("stop")) {
                break;
            }
            int id = s.nextInt();

            Person pp = new Person(name, id);//Person 클래스 객체 생성, 생성된 pp에 내가 입력한 값을 저장

            //pp에 정보가 들어있는지 아닌지 알기 위해서 위해 equals 함수에서
            if (a.contains(pp)) {//a(arraylist)에 지정된 요소가
                // 이 목록에 포함되어 있는 경우 true를 반환합니다.
                System.out.println(pp.getName() + "은 이미 있다");
            } else {
                a.add(pp);

            }
            //arraylist에 값 저장함
        }
    }

    void out() {
        while (true) {
            Random r = new Random();

            //이 의사 난수 생성기의
            // 시퀀스에서 0(포함)과 지정된 값(미포함) 사이에서 균등하게 분포된 의사 난수 int 값을 반환합니다.
            //0부터 내가쓴 개수까지 받아서 난수 발생을시켜 임의 정수값을 정수형 n에 받는다
            int n = r.nextInt(a.size());
            Person p = a.get(n);// 난수 발생 임의의 정수값을 인덱스로 세팅해서 p에 담는다
            String str = p.getName();//p는 인덱스 번호이기 때문에 뒤에 .getname()붙여줘서 이름을 str에넣어줌

            System.out.println(str + "의 id는?");//성탄의 id는?
            int id = p.getId();//112

            Scanner s = new Scanner(System.in);
            int i = s.nextInt();

            if (i == -1) {
                break;
            }
            if (i == id) {
                System.out.println("정답");
            } else
                System.out.println("정답아님");
        }
    }

    void end() {
        System.out.println("종료");
        System.exit(0);//프로그램 종료시킴
    }
}


public class Prac10 {
    public static void main(String[] args) {

        Game g = new Game();

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("1,2,3");
            //1. in(함수)
            //2. out(함수)
            //3. end(함수)
            int n = s.nextInt();

            switch (n){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;
            }
        }

    }
}
