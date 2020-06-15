package standardClass;
public class Task3 {
    public static void main(String[] args) {
        String strA = ("文字列: ABCDEFG");
        System.out.println(strA);

        //文字列の長さを調べるためにコーディングしました。
        //System.out.println(strA.length());
        
        char endOfstr = strA.charAt(strA.length()-1);
        System.out.print(endOfstr);
        char str10 = strA.charAt(10);
        System.out.print(str10);
        char str9 = strA.charAt(9);
        System.out.print(str9);
        char str8 = strA.charAt(8);
        System.out.print(str8);
        char str7 = strA.charAt(7);
        System.out.print(str7);
        char str6 = strA.charAt(6);
        System.out.print(str6);
        char str5 = strA.charAt(5);
        System.out.print(str5);
        char str4 = strA.charAt(4);
        System.out.print(str4);
        char str3 = strA.charAt(3);
        System.out.print(str3);
        char str2 = strA.charAt(2);
        System.out.print(str2);
        char str1 = strA.charAt(1);
        System.out.print(str1);
        char leadOfStr = strA.charAt(0);
        System.out.print(leadOfStr);
    }
}