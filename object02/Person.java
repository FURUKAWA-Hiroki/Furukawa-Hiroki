package object01;
//オブジェクト指向-課題3
public class Person{
    public static void main(String[] args) {}
    // 「public static void main(String[] args) {}」を宣言しないとJavaアプリケーションを
    //実行できないので宣言します。

        //-------フィールド-------------
    private String name;
    private int age ;

        //------ メソッド---------------
        //nameのgeter
    public String getName() {
        return this.name;
    }
         //nameのsetter
    public void setName(String name) {
        this.name = name;
    }
        //ageのgetter
    public int getAge() {
        return this. age;
    }
        //ageのsetter
    public void setAge(int age) {
        this.age = age;
    }
}