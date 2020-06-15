package variable;
public class Task3 {
    public static void main(String[] args) {
        int intNum = 219;
        long a =(long)intNum;
        double doubleNum = 364.2;
        float b = (float)doubleNum;

        long longNum = 123456L;
        double c = longNum;

        System.out.println("変換前");
        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(longNum);
        System.out.println("変換後");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}  //上書き保存のため書き込み