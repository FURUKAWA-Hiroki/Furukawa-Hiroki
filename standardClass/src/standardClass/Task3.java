package standardClass;
public class Task3 {
    public static void main(String[] args) {
        String strA =  "文字列: ABCDEFG";
        String strB = "";
        System.out.println(strA);

        for(int i = strA.length(); i > 0 ;i--){
            strB = strB + strA.charAt(i-1);
        }
        System.out.println(strB);
    }
}