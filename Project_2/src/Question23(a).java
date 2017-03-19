import java.util.Scanner;

class Question23a{
   public static void main(String[] args){
      
      Scanner inData = new Scanner (System.in);
      
      int num;
      String XO = "XO";
      
      System.out.print("Enter a number: ");
      num = inData.nextInt();
      
      for(int OX = 1; OX <=num; OX++)
      {
         System.out.print(OX);
      }
   }
}
 