package object01;
//オブジェクト指向-課題1/課題2
public class Person{

    //名前
    String name;
    //年齢
    int age;
    //財布
    static int wallet;

    //引数無しでインスタンス化したときに実行される
    public Person() {}
    //引数有りでインスタンンスしたときに実行される
    public Person(String name,int age){
         //nameフィールド
            this.name = name;
        //ageフィールド
            this.age = age;
    }
    public Person(int money) {
        Person.wallet = money + wallet;
    }

    public void myProfile() {
        System.out.println("私の名前は" + this.name +"です。");
        System.out.println("私の名前は" + this.age +"です。");
        System.out.println("よろしくお願いします。");
    }
}