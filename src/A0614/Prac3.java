package A0614;

import java.util.Vector;

public class Prac3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(4);//자동 박싱 기능으로 인해 (new Integer(4));처럼 클래스명 구지 안해줘도됨
        v.add(5);
        v.add(0,20);

        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);

        }
    }
}
