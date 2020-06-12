package standardClass;
public class Task3 {
    public static void main(String[] args) {
        String[] text1 = new String [] {"文字列: ABCDEFG"};
       /*st 0 文
            1 字
            2　列
            3 :
            4 A
            5 B
            6 C
            7 D
            8 E
            9 F
            10 G
       */
        for(int i = text1.length -1 ; i > 0; i--) { 
            System.out.print(text1[i]);
            /*iを宣言、iの値をiに代入したのち、iを今回のarraylength(arery[10]2)の値までループ処理した後
              array内で加算していきます。
            */
        }
    }
}