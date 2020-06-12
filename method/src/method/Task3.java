package method;
public class Task3 {
    public static void main(String[] args) {

        //if(
        System.out.println("---⓵  文字列だけの場合---");
        System.out.println(add("文字数1" ,"/文字列文字列2"));

        //else if{
        System.out.println("---② 整数だけの場合---");
        System.out.println(add(10 ,8 ));

        //else if{
        System.out.println("---③ 小数だけの場合---");
        System.out.println(add(3.6 ,6.4 ));
    }
    //returnにて戻ってきた値を出力しています。
    //addにてメソッドを作成して以下、文字列、整数、小数の値に格納しています。
    //条件分岐をして出力制御をするか否かはレビューを拝読してから考えようかと思います。
    //技術的な質問でなく、国語の疑問なので、質問チャンネルへの投稿は差し控えます。

    public static String add(String a , String b) {
        return a + b;
    }
    public static int add(int a , int b ) {
        return + a + b;
    }
    public static double add(double a , double b) {
        return a + b;
    }
    //オーバーロードを使用するようにとの問題問題文指定がありましたので、
    //変数を全て同じ文字で定義しています。
    //returnにて戻り値を指定しております。

}