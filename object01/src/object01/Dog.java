package object01;
//オブジェクト指向-課題4
public class Dog extends Animal{
    /*---フィールド---
     ---Animalフィールドを継承したDogのフィールドにweightを追加---
    */
    double weight;

    //---コンストラクタ---
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //---メソッド----
    //runメソッドを追加
    public void run() {
        System.out.println(this.name + "は走った");
    }
    //sleepメソッドをオーバーライド（複数定義）
    public void sleep() {
       System.out.print(this.name + "は");
       super.sleep();
    }
}