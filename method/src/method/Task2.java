package method;
public class Task2 {
    public static void  main(String[] args) {
        System.out.println("三角形の面積");
        double triangleArea = getTriangleArea(27.0 ,10.0);
        System.out.println(triangleArea + "㎠");
    }
    //メソッド「getTriangleArea」と引水に格納しました三角形の底辺と高さの値を格納
    //returnで戻ってきた変数であり、面積の値「teiangleArea」を出力しています。

    public static double getTriangleArea (double btm ,double tall){
        double triangleArea =(int)(btm * tall / 2);
        return triangleArea;
    }
    //メソッドにて定義した引数を用いて、三角形の値を算出。
    //強制的な型変換で、四捨五入しています。return以下にて戻り値を指定しています。
}