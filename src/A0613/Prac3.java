package A0613;
class In{
    private int num;

    public In(int num) {
        this.num = num;
    }

    //toString()은 객체를 문자열로 반환한다. wer@34jler > 알맞은 문자열로 변경해줌
    public String toString(){
        return num + " ";
    }
}
public class Prac3 {
    public static void main(String[] args) {

        In i = new In(4);
        //i.toString()을 안하는 이유 : class In은 자동으로 object를 상속 받고 있다.
        System.out.println(i);//객체를 문자열로 변경 >toString(객체 출력시 자동호출됨)
    }
}
