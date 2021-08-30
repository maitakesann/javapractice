class Java3{
    public static void main(String[] args){

      /*int isHungry = 0 ;
      String food = "rice";
      System.out.println("こんにちは");
      if (isHungry == 0){
        System.out.println("お腹がいっぱいです");
      }else{
        System.out.println("腹ペコです");
      }
      if(isHungry == 0){
        System.out.println(food + "をいただきます");
      }else{
        System.out.println("ごちそうさまでした");
      }


      System.out.println("数当てゲーム");
      int ans = new java.util.Random().nextInt(10);
      for(int i = 0; i < 5; i++){
        System.out.println("0~9の数字を入れてください");
        int num = new java.util.Scanner(System.in).nextInt(10);
          if(num == ans){
            System.out.println("アタリ！");
            break;
          }else{
            System.out.println("違います");
          }
      }
      System.out.println("ゲームを終了します");*/
      int[] scores = {20,30,40,50,60};
       for(int i = 0 ; i < scores.length; i++){
        System.out.println(scores[i]);
       }

       int [] o = {20,30,40,50,60};
        for(int p : o){
          System.out.println(p);
        }

        int[] points = new int[4];
        double[] weghit = new double[5];
        boolean[] anserws = new boolean[3];
        String[] names = new String[3];

        int[] maneyList = {121902,8302,55100};
        for(int u = 0; u < maneyList.length; u++ ){
          System.out.println(maneyList[u]);
        }
        for(int maney:maneyList){
          System.out.println(maney);
        }

        int[] numbers = {3,4,9};
        System.out.println("1桁の数字を画面に入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int p = 0 ; p < numbers.length; p++){
          if(input == numbers[p]){
            System.out.println("アタリ");
          }
        }
    }
}