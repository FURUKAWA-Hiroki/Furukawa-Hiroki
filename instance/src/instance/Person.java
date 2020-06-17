package instance;
//課題1
public class Person{
    String name;
    int age ;
    //アクセス制限を持つクラスをTask1ブロック以下に作成しています。
    //また、アクセス修飾子を外しております。

    //以下課題3のコードです。
    public void myProfile() {
        System.out.println("私の名前は" + this.name + "です。");
        System.out.println("年齢は" + this.age + "です。");
        System.out.println("よろしくお願いします。");
        
    }
}