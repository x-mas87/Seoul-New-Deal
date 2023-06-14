package A0614;
import java.util.ArrayList;
import java.util.List;

class Profile{
    String id;
    int age;

    Profile(String id, int age) {
        this.id = id;
        this.age = age;
    }

}


public class Prac2 {
    public static void main(String[] args) {
        //List interface -> <>
        ArrayList<Profile> a = new ArrayList<Profile>();

        //list interface에는 데이터를 순차적으로 저장할수있다
        a.add(new Profile("aa", 12));//<String>이면 그냥 인덱스 번호만 들어가면되는데
        a.add(new Profile("bb", 13));//<객체: Profile>이면 add()인자 안에 new 객체(인자안 데이터설정)
        a.add(new Profile("cc", 14));//을 해줘야한다.

        for (int i = 0; i < a.size(); i++) {
             Profile p = a.get(i);
            System.out.println(p.id + " " + p.age);//인덱스에 내가 넣어놓은 문자,정수값이 나옴
            //근데 (p)로 찍어서 출력을 하면  객체위치(A0614.Profile@776ec8df)요렇게 나온다
        }

    }
}
