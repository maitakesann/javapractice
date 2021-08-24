public class hello {

  public static void main(String []args) {
    System.out.println("Hello, World!");

    System.out.println("The sum of 2 and 3 is 5.");

    int x = 7 ;int y = 5;
    System.out.println(x * y);

    int oddSum = 0;
    int evenSum = 0;

    int[] numbers = {1,2,3,4,5,6,7,8,9};
      for (int i = 0; i < numbers.length; i++){
        if(numbers[i] % 2 == 0){
          evenSum += numbers[i];
        }else{
          oddSum += numbers[i];
        }
      }
    System.out.println(oddSum);
    System.out.println(evenSum);

  }
}