import java.util.Scanner;

class Question21{
   public static void main(String[] args){
      
      int min, max, increment;
      Scanner inData = new Scanner(System.in);
      
      System.out.print("Enter the min: ");
      min = inData.nextInt();
            
      System.out.print("Enter the max: ");
      max = inData.nextInt();
      
      System.out.print("Enter the increment: ");
      increment = inData.nextInt();
      
      for (int i = min; i <= max; i=i+increment)
      {
         System.out.println(i);
      }
   }
}
