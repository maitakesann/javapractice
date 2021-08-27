public class Main{
  public static void main (String[] args){
    int a = 3;
    int b = 5;
    int c = a * b;
    System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);

    String age = "31";
    int n = Integer.parseInt (age);
    System.out.println("あなたは来年" + (n + 1) + "歳になります");

    int r = new java.util.Random() .nextInt(90);
    System.out.println("あなたは多分" + r + "歳ですね？");

    /*System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in) .nextLine();
    System.out.println("あなたの年齢を入力してください");
    int age2 = new java.util.Scanner(System.in) .nextInt();
    System.out.println("あなたは" + age2 +"歳で、名前は" + name + "です。");*/

    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name2 = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
      String ageString =new java.util.Scanner(System.in).nextLine();
        int age3 = Integer.parseInt(ageString);
    //7
    int fortune = new java.util.Random().nextInt(4);
    //8
    fortune ++;
    //9
    System.out.println("占いの結果が出ました");
    //10
    System.out.println(age3 + "齢の" + name2 + "さん、あなたの運気は" + fortune + "です");


  }
}