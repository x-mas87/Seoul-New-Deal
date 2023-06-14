package A0614;
//13일 문제5

class Circle{
    int r;

    public Circle(int r) {
        this.r = r;
    }
    public String toString(){//자동 호출되서 객체를 문자열을 변경
        return r + " ";
    }
    public boolean equals(Object ob){//Object ob = new Circle()
        if (this.r == ((Circle)ob).r){//다운캐스팅
            return true;
        }
        else {
            return false;
        }
    }

    public class A0614_2 {
    public static void main(String[] args) {
        Circle a=new Circle(30);

        Circle b=new Circle(30);

        System.out.println("반지름"+a);//왜 30이 나오냐면 toString자동호출됨

        System.out.println("반지름"+b);//왜 30이 나오냐면 toString자동호출됨

        if(a.equals(b)) {//객체비교 > 이렇게 적으면 객체 주소값이 비교가 됨

            System.out.println("같은 원"); }

        else {

            System.out.println("다른 원");} }
    }
}
