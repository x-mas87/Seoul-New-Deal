package Test;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("김성탄",1.2);
        map.put("김진아",1.3);

        Scanner s = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = s.next();

        Double value = map.get(name);

        if (value != null){
            System.out.println(name + "의 키는" + value);
        }
        else {
            System.out.println("이름이 없습니다.");
        }

    }
}
