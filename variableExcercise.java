import java.util.Scanner;

public class variableExcercise {
    public static void main(String[] args) {
       String name;
       int age;
       double annualPay;

       Scanner keyboard =new Scanner(System.in);

       
       System.out.println("Enter your name");
       name=keyboard.nextLine();

       
       System.out.println("Enter your age");
       age=keyboard.nextInt();

       System.out.println("Enter your annaualPay");
       annualPay=keyboard.nextDouble();

       System.out.println("Your name is " + name + " and your age is " + age + " and your annual pay is " + annualPay);



      keyboard.close();


    }
    
}
