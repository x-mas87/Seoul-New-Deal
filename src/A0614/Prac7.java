package A0614;

import java.util.Scanner;

abstract class Calc {

    double op1;
    double op2;

    void set(double op1, double op2) {
        this.op1 = op1;
        this.op2 = op2;

    }

    abstract double calculate();

}

class Add extends Calc {
    double calculate() {
        return op1 + op2;

    }
}

class Sub extends Calc {
    double calculate() {
        return op1 - op2;
    }
}

class Mul extends Calc {
    double calculate() {
        return op1 * op2;
    }
}

class Div extends Calc {
    double calculate() {
        return op1 / op2;
    }
}

public class Prac7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("두 피연산자와 연산자 입력:");
        int a = s.nextInt();
        int b = s.nextInt();
        String c = s.next();


        Calc calc = null;


        switch (c) {
            case "+":
                calc = new Add();//upcasting : add클래스에 calculate()함수를 호출
                break;
            case "-":
                calc = new Sub();
                break;
            case "*":
                calc = new Mul();
                break;
            case "/":
                calc = new Div();
                break;
                
            default:
                System.out.println("올바른 연산자가 아니다.");
                return;
        }


        calc.set(a,b);
        System.out.println("답 : " + calc.calculate());
    }
}
