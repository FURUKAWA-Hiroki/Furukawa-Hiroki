//今後のために、条件式を一々言語化します。冗長になってしまい申し訳ないです。

package array;
public class Task2{
    public static void main(String[] args){
        int[] array = new int [7];
        for(int i = 0; i <array.length; i++){
            array[i] = 7 - i;
        }
        //変数iをaray.length(今回の要素数iまで++にてインクリメントした後
        //配列に格納されたiを7から減算していくことを示しています。

        for(int i = 0; i < array.length;i++){
            if(i < array.length - 1){
                System.out.print(array[i] + ",");
            }else{
                System.out.println(array[i]);
            }
        }
        /*   for文で初期化した後、array.lengthの値までループ処理することを
                            示しています。
                               また、iを0より大きいと指定することで、無限ループになることを防ぐ条件指定を
                              しています。
            　　　　　　   if文にてiがarray.lengthの値より小さいときに、
            　　　　　　減算されていく配列に格納されたiの値を示しています。
             else文にて1までiが減算されたときに改行を促しています。
         */

        for(int i = array.length -1 ; i >= 0 ;i--) {
            if(i > 0) {
                System.out.print(array[i] + ",");
            }else{
                System.out.println(array[i]);
            }
        }
        //for文にてi2の値を指定。array.lengthの値までインクリメントする
        // ループ処理をしています。if文にてi2の値がarray.lengthより小さいとき
        //出力するように促しています。elseがないと条件式がエラーとなるので入力の上、
        //改行を促しています。
    }
} //保存用　保存用