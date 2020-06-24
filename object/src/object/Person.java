package object;
//オブジェクト指向-課題1/課題2/課題3

//カプセル化してgettersetterの作成が、
//課題3の課題要件であるにも関わらず,ケアレスミスでの漏れがあり、申し訳ございません。
public class Person{
    //名前
     private String name;
    //年齢
     private int age;
    //財布
     static int wallet;

    //引数無しでインスタンス化したときに実行される
    public Person() {}
    //引数有りでインスタンンスしたときに実行される
    public Person(String name, int age){
         //nameフィールド
            this.name = name;
        //ageフィールド
            this.age = age;
    }
    public Person(int money) {
        Person.setWallet(Person.getWallet() + money);
    }

    public void myProfile() {
        System.out.println("私の名前は" + this.name +"です。");
        System.out.println("私の名前は" + this.age +"です。");
        System.out.println("よろしくお願いします。");
    }
      //------ メソッド---------------
      //nameのgeter
    public String getName() {
        return this.name;
    }
       //nameのsetter
    public void setName(String name) {
        this.name = name;
    }
      //ageのgetter
    public int getAge() {
      return this. age;
    }
      //ageのsetter
    public void setAge(int age) {
        this.age = age;

    //カプセル化するためのgetterとsetterメソッドの作成
    }
	public static int getWallet() {
		return wallet;
	}
	public static void setWallet(int wallet) {
		Person.wallet = wallet;
	}
}