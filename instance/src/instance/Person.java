package instance;
public class Person{
          public String name;
          public int age ;
    //アクセス制限を持つクラスをTask1以下に作成しています。
    //属性を宣言した上で、フィールドを宣言しています。
        public static void myProfile(String name, int age) {
            myProfile("古川裕貴です。", 26);
        }
}
/*Task3用にmyPogfileのメソッドを作成しています。
     ・前回提出時はPersonをクラス名にしたところ、
  Javaアプリケーションにて実行出来なかったため
  class名をTask１で記述でしたが、
  　今回はデバッグにて確認済です。
*/