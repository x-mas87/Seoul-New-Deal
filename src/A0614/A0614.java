package A0614;
//카페 16일 문제 6번
interface Re{
    default void show(){
        System.out.println("사각형!!");
    }
    int area();//public abstract 생략되어있음

}
class Rec implements Re{

    int i,j;
    Rec(int i, int j) {
        this.i = i;
        this.j = j;

    }
    public int area(){
        return i*j;
    }
}
public class A0614 {

    public static void main (String[] args){
        //main()를 보고 인터페이스를 작성해라. (인터페이스명은 Re,
        // 모든 메소들들을 인터페이스안에서 선언하고 show함수는 default로 설정,area는 abstract로 설정)
        Re r=new Rec(10,20);

        r.show(); //"사각형!!" 출력

        System.out.println("면적"+ r.area());
    }
}
