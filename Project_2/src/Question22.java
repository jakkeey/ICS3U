import java.util.Scanner;

class Question22{
   public static void main(String[] args){
      
      Scanner inData = new Scanner(System.in);
      int numberOfNum, sum = 0;
      double average;
      
      System.out.print("How many numbers would you like to add? ");
      numberOfNum = inData.nextInt();
            
      for (int x = 1; x<=numberOfNum; x++)
      {
         System.out.print("Enter number " + x + " : ");
         sum = sum + inData.nextInt();
                          
      }
      
      average = sum/numberOfNum;
       

      //output
      System.out.println("The average of your number is " + average + ".");
      
   }
}
  
  
  
  
 