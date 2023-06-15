package Test;

class Num2{
    private int sum;
    private int max;

    public Num2() {
    }

    public Num2(int n){
        sum = n;
        max = n;

    }
    void add(int n){
        sum += n;
        if (max < n){
            max = n;
        }
    }

    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }
}


public class second_2 {
    public static void main(String[] args) {
        Num num = new Num();
        num.add(5);
        num.add(10);
        num.add(3);

        System.out.println(num.getSum());
        System.out.println(num.getMax());

    }
}
