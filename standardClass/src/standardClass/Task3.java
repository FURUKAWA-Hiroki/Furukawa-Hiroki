package standardClass;
public class Task3 {
    public static void main(String[] args) {
        String strA =  "文字列: ABCDEFG";
        System.out.println(strA);

        for(int i = strA.length(); i > 0 ;i--){
            System.out.print(strA.charAt(i-1));
        }
    }
}