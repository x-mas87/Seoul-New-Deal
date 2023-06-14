package A0614;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

//게임 프로그램의 예를 들어 (테트리스 게임하나할수있는 스레드 1, 채팅할수있는 스레드2, 음악들을수 있는 스레드3)
//(스레드 한개하나가 3개스레드(멀티스레드) 즉 하나의 프로그램안에  총3개가 돌아가고 있는것
//멀티 스레드를 할때는 동기화가 되야함
public class Prac4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(53);
        list.add(3);
        list.add(4);

        Iterator<Integer> it = list.iterator();

        //iterator는 while문과 많이씀
        while (it.hasNext()){
            int n = it.next();//다음 인덱스에 값이 있을때까지 loop하고, 꺼내서 int n에 저장
            System.out.println(n);

        }
    }

}
