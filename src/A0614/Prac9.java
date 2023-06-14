package A0614;
//Thread : 스레드는 프로그램 내에서 실행되는 실행 흐름입니다.
// Java 가상 머신은 하나의 응용 프로그램이 여러 개의 스레드를 동시에 실행할 수 있게 해줍니다.

class Th extends Thread{
    String name;
    Th(String n ){
        name = n;
    }
    public void run(){
        //만약 이 스레드가 별도의 Runnable run 개체를 사용하여 생성된 경우,
        // 그 Runnable 개체의 run 메서드가 호출됩니다. 그렇지 않으면 이 메서드는 아무 작업도 수행하지 않고 반환됩니다.
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(100);//run()이 가동 안될때 예외처리하는 것
            }
            catch (Exception e){}

        }
    }
}
public class Prac9 {
    public static void main(String[] args) {

        Th t = new Th("스레드1");
        Th t2 = new Th("스레드2");

        t.start();//스레드의 작동시작(JVM에 의해 스케줄 되기 시작함)
        t2.start();
        //스레드 1,2가 순서대로 안찍힘 왜냐 동기화가 안돼어있기때문

        //스레드 객체 생성하는 두가지 방법
        //1. 스레드 클래스 사용
        //2. Runnable  인터페이스 사용
        //인터페이스 Runnable을 구현하는 개체를 사용하여 스레드를 생성할 때,
        // 스레드를 시작하면 해당 개체의 run 메서드가 별도의 실행 스레드에서 호출됩니다.

    }
}
