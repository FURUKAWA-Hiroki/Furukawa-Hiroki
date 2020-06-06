package instance;
class Person{
    public String setName;
    public int setAge;
}
public class Task2{
    public static  void main(String[] args) {
    //アクセス制限を持つクラスをTask1以下に作成しています。
    Person hiroki = new Person();
    hiroki.setName = "古川 裕貴";
    hiroki.setAge = 26 ;
    //属性を宣言した上で、フィールドを宣言しています。
    System.out.println(hiroki.setName);
    System.out.println(hiroki.setAge);
    }

}