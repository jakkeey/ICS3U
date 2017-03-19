import java.util.Scanner;
class Question20{
  
   public static void main(String[] args){
      
      Scanner inData = new Scanner(System.in);
      int number;
      
      System.out.print("Enter a number: ");
      number = inData.nextInt();
      
      for (int i = 0; i<= number; i++)
         System.out.print(i + " ");
   }
}

