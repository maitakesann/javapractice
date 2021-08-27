
package SequenceNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public class hello {
      public static void main(String args[]) {
          task();

          // 計算の確認として、フィボナッチ数列を順番に表示 (20番目まで)
          for (int i = 1; i <= 20; i++) {
              System.out.print("" + calculation(i) + " ");
          }
          System.out.println();
      }

      static void task() {
          System.out.println("フィボナッチ数列の第n項を調べてやる、です");
          System.out.println("好きな数を打ちやがれ、です");
          Scanner scan = new Scanner(System.in); // キー入力
          try {
              int n = scan.nextInt();
              if (1 <= n) {
                  print_result(calculation(n), n); // 計算結果表示
              } else {
                  System.out.println("1 以上で指定してください");
              }
          } catch (InputMismatchException e) { // 入力が数字以外の場合
              System.out.println("数字入れろって言ってるダルォ！？");
          }
      }

      static long calculation(int n) {
          if (n < 2) {
              return 0;
          }
          if (n == 2) {
              return 1;
          }
          long ans = 0;
          long n1 = 0;
          long n2 = 1;
          for (n -= 2; n > 0; n--) {
              ans = n1 + n2;
              n1 = n2;
              n2 = ans;
          }
          return ans;
      }

      static void print_result(long fib, int n) {
          System.out.println("フィボナッチ数列の第" + n + "項目の数は" + fib + "です。");
      }
  }
}