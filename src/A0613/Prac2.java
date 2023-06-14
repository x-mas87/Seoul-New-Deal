package A0613;
//다중 상속
class Tv {
    public void on(){
        System.out.println("티비 켬");
    }
}
interface Computer{
    public void m();//추상 메소드
}

class Com{
    public void m(){
        System.out.println("켬");
    }
}
class Ipad extends Tv implements Computer{
    Com c = new Com();

    public void m(){//오버라이딩(Computer인터페이스에 있는 함수 재정의)
        c.m();//컴 class의 "켬"이 출력됨
    }
    public void ip(){
        m();
        on();
    }
}
public class Prac2 {
    public static void main(String[] args) {

        Ipad i = new Ipad();
        Tv t = i; //up
        Computer c = i; // up

        i.ip();
    }
}
