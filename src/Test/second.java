package Test;

class Num{
    private int sum;
    private int max;

    public Num() {
        sum = 0;
        max = Integer.MIN_VALUE;
    }

    public Num(int sum, int max) {
        this.sum = sum;
        this.max = max;
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
public class second {
    public static void main(String[] args) {

        Num nb = new Num();
        nb.add(7); nb.add(-1); nb.add(20); nb.add(5); // 4개 숫자를 입력
        System.out.println("Sum = " + nb.getSum());   // 4개 숫자의 합계
        System.out.println("Max = " + nb.getMax());   // 4개 숫자 중 최대값

    }

}
