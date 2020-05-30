//今後のために、条件式を一々言語化します。冗長になってしまい申し訳ないです。

package array;
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {4,9,19,5,8,21,42,64,73,18,2};
        System.out.print("配列:　[");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            /*iを宣言、iの値をiに代入したのち、iを今回のarraylength(arery[10]2)の値までループ処理した後
              array内で加算していきます。
            */

            if(i < array.length -1){
                System.out.print(",");
            }else {
                System.out.println("]");
            }
        }
        /*for文内大ブロック内にて、iの 値が加算されています。
                          そして、if文にて、iの値がarraylengthの値の前の値（-1にて指定）した場合、,を入力する分岐処理をしています。
                          また、else文にてiの値がlengthの値の前の値（-1にて指定）以外の場合、則ちarraylenghのとき"}"
                          を入力する分岐処理をしています。
        */

        int sum = 0;
        for(int i2 : array) {
            sum += i2;
        }
        System.out.println("合計:" + sum);
        /*iの値は既に前のfor文で指定しているので、for文にて別の変数(i2)を指定しています。
                        拡張for文にて(inti2 = 0; i <array; I++)と同じ処理をしています。
          　　　　　合計の値を一度初期化した変数sumに代入した後、自動加算されてきたiの和として算出しています。
        */
    }
} //保存用　　　　