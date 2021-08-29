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
    }
}