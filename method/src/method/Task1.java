package method;
public class Task1 {
    public static void main(String[] args) {
        myProfile("古川裕貴です。", 26, 175.0);
    }
        //myprofileメソッドに名前、年齢、身長をそれぞれ格納しています。

    public static void myProfile (String a, int b, double c){
        System.out.println("私の名前は" + a);
        System.out.println("年齢は" + b + "歳です。");
        System.out.println("身長は" + c + "cmです。");
        System.out.println("よろしくお願いします。");
    }
}