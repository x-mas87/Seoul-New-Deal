package A0614;

import java.util.HashMap;
import java.util.Map;

//hashmap : 네이버 로그인시 아이디에 키값(고유값), 비밀번호에 벨류값을 넣어서 로직을  만들수 있음
public class Prac5 {
    public static void main(String[] args) {
        Map<Integer, String> h = new HashMap<>();
        //Hashmap : 요소 삽입은 put() , 요소 검색은 get()
        h.put(1,"aa");
        h.put(2,"bb");

        System.out.println(h.get(1));
        System.out.println(h.get(2));

    }
}
