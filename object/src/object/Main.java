package object;
//オブジェクト指向-課題2/課題5
public class Main {
    public static void main(String[] args) {
        System.out.println("インスタンスを生成していない状態");
        System.out.println(Person.getWallet());

        //インスタンスを2つ生成
        Person hoge01 = new Person(1000);
        Person hoge02 = new Person(2000);


        System.out.println("インスタンスhoge01でwalletにアクセス");
        System.out.println(hoge01.getWallet());
        System.out.println("インスタンスhoge02でwalletにアクセス");
        System.out.println(hoge02.getWallet());
        System.out.println("クラスPersonでwalletにアクセス");
        System.out.println(Person.getWallet());

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