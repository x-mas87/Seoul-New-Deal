package A0613;
interface Addin{
    public int add(int a, int b);
    public int add(int a);//오버로딩

    default  void pr(){
        System.out.println("히히");
    }
}
class Add implements Addin{
    public int add(int a , int b){//오버라이딩
        return  a-b;
    }
    public int add(int a){
        return a;
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(3, 4));

        Addin a2 = new Add(); //upcasting
        System.out.println(a2.add(3));
    }
}