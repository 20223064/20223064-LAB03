import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);
      Scanner input = new Scanner(System.in);

      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();
      System.out.print("Enter your years: ");
      int years = input.nextInt();
      System.out.print("Enter your height: ");
      int height = input.nextInt();

      // display output on console
      System.out.println("your name is " + name);
      System.out.println("your years is " + years);
      System.out.println(365*years);
      System.out.printf("2022년 09월 20일 현재 "+ name + "(" + years + ")"+ "의 키는 "+ height+ "cm 입니다");

   }  // method main

}  // class BasicIO