import java.util.Scanner;

public class it24103537Lab5Q1{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First number:");
      int num1 = scanner.nextInt();
      
      System.out.print("Enter second number:");
      int num2 = scanner.nextInt();

      System.out.print("Enter third number:");
      int num3 = scanner.nextInt();
     
      int smallest,largest;

      if(num1 <= num2 && num1 <= num3) {
         smallest= num1;
      } else if(num2 <= num1 && num2 <= num3){
         smallest = num2;
      } else {
         smallest = num3;
      }
      
      if(num1 >= num2 && num1 >= num3){
         largest = num1;
      }else if (num2 >= num1 && num2 >= num3){
         largest = num2;
      } else {
          largest = num3;
      }
      System.out.println("User entered numbers are: "+num1+" "+num2+" "+num3);
      System.out.println("The smallest number is: " + smallest);
      System.out.println("The largest number is: " + largest);
   }
}
         