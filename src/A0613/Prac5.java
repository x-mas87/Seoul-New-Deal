package A0613;

import java.util.Scanner;

class Profile {
    String name, id;

    Profile(String n, String i) {
        name = n;
        id = i;
    }

    void get() {
        System.out.println(name + " " + id);

    }
}

public class Prac5 {
    public static void main(String[] args) {

        Profile p[] = {new Profile("aa", "bb"),
                new Profile("cc", "dd")};//객체배열 초기화


//        for(int i=0;i<2;i++) {
//            String name=s.next();
//            String id=s.next();
//            p[i]=new Profile(name, id);
//        }
        for (Profile a :
                p) {
            a.get();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(p[i].name + " " + p[i].id);
        }

    }
}