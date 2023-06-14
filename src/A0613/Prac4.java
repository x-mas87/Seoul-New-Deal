package A0613;
//박싱 언박싱
public class Prac4 {
    public static void main(String[]args){
        //Integer i = new Integer(10);//boxing : 기본데이터타입 > 객체화 시켜서 포장한다는 의미
        //Integer i = 10; 도 됨 Auto boxing
       // int i1 = i.intValue(); // unboxing : 객체화 된 타입을 > 기본타입으로 포장을 해제해주는 의미

        //Character c = new Character('a');
       // char c1 = c.charValue();

        //Boolean b = new Boolean(true);
       // boolean b1 = b.booleanValue();
        
        //문자열을 기본타입으로 변환
        //기본 타입 8개의 대한 클래스 > Wrapper 클래스
        int i2 = Integer.parseInt("123");
        boolean b2 = Boolean.parseBoolean("true");
        double d2 = Double.parseDouble("3.14");

        //정수형 객체 Integer 123을 문자열로 변환한다.
        String s = Integer.toString(123);
        System.out.println(s);

        Integer i11 = 100; //auto boxing
        int n1 = i11 + 200; //auto unboxing
        System.out.println(n1);

    }
}
