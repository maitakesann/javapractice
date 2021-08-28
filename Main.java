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

    /*System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
      String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
      String ageString = new java.util.Scanner(System.in).nextLine();
        int age2 = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました");
    System.out.println(age2 + "歳の" + name + "の運勢は" + fortune + "です");

    for(int q = 0; q < 5; q ++){
      System.out.println("これは" + (q + 1) +"です");
    }

    //99の段
    for(int w = 1 ; w < 10; w++){
      for(int e =1; e < 10; e++){
        System.out.print(w * e);
        System.out.print(" "); //空白
      }
        System.out.println(""); //改行
    }*/

    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更"); 
      int selected = new java.util.Scanner(System.in).nextInt();
      switch(selected){
        case 1: System.out.println("検索します");
        break;
        case 2: System.out.println("登録します");
        break;
        case 3: System.out.println("削除します");
        break;
        case 4: System.out.println("変更します");
        break;
        default:System.out.println("");
      }
  }
}