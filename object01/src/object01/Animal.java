package object01;
//オブジェクト指向-課題4
public class Animal {
    //-----名前と年齢のフィールド-----
    String name;
    int age;

    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sleep() {
        System.out.println("眠った");
    }
}