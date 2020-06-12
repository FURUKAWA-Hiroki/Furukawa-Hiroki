package method;

public class Task4 {
    public static void main(String[] args) {
        String[] array1 = {"a" ,"b" ,"c"};
        String[] array2 = {"a" ,null ,"c"};

        //配列に問題文の指示にある配列を定義しています。

        System.out.println("---配列にnullがない場合---");
        System.out.println(nullCheck(array1));
        System.out.println("---配列にnullがある場合---");
        System.out.println(nullCheck(array2));
    }
    public static boolean nullCheck(String[]arrays){
        boolean blanch = false;
        for (int i = 0; i < arrays.length;i++){
            if(arrays[i] == null){
                blanch = true;
            }
        }
        return blanch;
    }
    /*1)文字列である配列（array1,array2）を
            　　個別にそれぞれ引数に定義するのではなく"arrays"で単一で引数に指定しています。
      2)return はreturn以後、ブロック外でも判定をしないので
               （課題3は同じ＋なので判定はされる）
               　仮定の正誤のbooleanの変数を定めます。
　　　　　3)配列内でインクリメントされていくiがnullに
               達したときのみtrueとbooleanの変数を置き換えています。
       returnはメソッド直下のブロックに指定しています。
     */
}