import java.util.Scanner;

public class condtionVariable {
    public static void main(String[] args) {
        System.out.println("Enter your grade");

        Scanner keyboard = new Scanner(System.in);
       



        // this is used to caculate Grade of student  base on their score
         int grade =keyboard.nextInt();
        if(grade >= 90){
            System.out.println("You hade a grade of A" );
        }
        else if(grade >=80){
              System.out.println("You hade a grade of B" );
        }

        else if(grade >=70){
              System.out.println("You hade a grade of C" );
        }

         else if(grade >=60){
              System.out.println("You hade a grade of D" );
        }

         else {
              System.out.println("You hade a grade of F" );
        }



        keyboard.close();
        
    }
}
