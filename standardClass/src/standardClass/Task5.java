package standardClass;
public class Task5 {
    public static void main(String[] args) {
        String aStr = "cat_mouse_mouse_cat_cat";
        String [] array1 = aStr.split("_");
        int countCat = 0;
        int countMouse = 0;
        for(String bStr : array1) {

        //文字列をaStrにて定義して、splitにて"＿"を分割して配列にしています。
        //カウントする為の変数を初期化した後、拡張for文にて配列の中身を取出しています。

            if("cat".equals (bStr)) {
                countCat++;
            }else{
                countMouse++;
            }
        }
        if(countCat > countMouse) {
            System.out.println("catの方が大きい");
        }else if(countMouse > countCat) {
            System.out.println("mouseの方が大きい");
        }else {
            System.out.println("catとmouseの数は同じ");
        }
    }
}
//上書き保存のためのコメントコメント