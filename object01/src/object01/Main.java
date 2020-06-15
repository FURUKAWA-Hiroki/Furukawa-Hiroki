package object01;
//オブジェクト指向-課題2
public class Main {
    public static void main(String[] args) {
        Person hoge01 = new Person(1000);
        Person hoge02 = new Person(5000);
        System.out.println(hoge01.wallet);
        System.out.println(hoge02.wallet);
    }
}