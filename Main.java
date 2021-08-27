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
  }
}