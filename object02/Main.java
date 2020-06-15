package object01;
//オブジェクト指向-課題5
public class main{
    public Main(String[] args) {
        Animal anim = new Animal();
        Dog dog = new Dog("ポチ", 5, 12.3);

        System.out.println("名前 :" + dog.name);
        System.out.println("年齢" + dog.age);
        System.out.println("体重" + dog.weight + "㎏");

        //runメソッドの呼び出し
        dog.run();
        //sleepメソッドの呼び出し
        anim.sleep();
        dog.sleep();
        }
    }
}