import java.util.Scanner;

class Question12{
   public static void main(String[] args){
      String answer;
      String answertwo;
      
      Scanner inData = new Scanner(System.in);
      System.out.println("What is the captial city in Canada?");
      answer= inData.nextLine();
      
      
      if(answer.equals("Ottawa")||answer.equals("ottawa"))
         
         System.out.println("You're correct, let's go to next question");
      else
         System.out.println("Incorrect");
       
                
      System.out.println("Who is the prime minister in Canada?");
      answertwo = inData.nextLine();
      
      if (answertwo.equals("Justin Trudeau")||answertwo.equals("justin trudeau")||answertwo.equals("Justin")||answertwo.equals("Trudeau"))
         
         System.out.println("Excellent");
      else 
         System.out.println("Incorrect");
      
      
       System.out.println("Who is the prime minister in Canada?");
      answertwo = inData.nextLine();
      
      if (answertwo.equals("Justin Trudeau")||answertwo.equals("justin trudeau")||answertwo.equals("Justin")||answertwo.equals("Trudeau"))
         
         System.out.println("Excellent");
      else 
         System.out.println("Incorrect");
      
      
       System.out.println("Who was the legendary Benedictine monk who invented champagne?");
      answertwo = inData.nextLine();
      
      if (answertwo.equals("Dom Perignon")||answertwo.equals("dom perignon"))
         
         System.out.println("Excellent");
      else 
         System.out.println("Incorrect");
     
     
       System.out.println("Where would you find the Sea of Tranquility?");
      answertwo = inData.nextLine();
      
      if (answertwo.equals("The Moon")||answertwo.equals("moon")||answertwo.equals("Moon"))
         
         System.out.println("well done");
      else 
         System.out.println("Incorrect");

      
   }
}