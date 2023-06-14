package A0614;

//제네릭클래스
// 클래스, 메소드에서 사용할 데이터 타입을 나중에 확정하는 기법이다
//즉 인스턴스를 생성할 때나 메소드를 호출할 때 정한다는 의미
class Java{

    String title;
    Java(String t){
        title=t;
    }
    void show() {
        System.out.println(title);
    }
}
class DB{

    int n;
    DB(int n){
        this.n=n;
    }
    void pr() {
        System.out.println(n);
    }
}

class Program<T>{  //모형자 <>: 제네릭 기호 

    T t;
    void in(T t) {  //void in(A a)
        this.t=t;
    }

    T get() {
        return t;
    }
}

public class Prac1 {
    public static void main(String[] args) {

        Program<Java> p=new Program<Java>();
        p.in(new Java("java"));
        Java j=p.get();
        j.show();


        Program<DB> d= new Program<DB>();
        d.in(new DB(3));
        DB d2=d.get();
        d2.pr();

    }

}