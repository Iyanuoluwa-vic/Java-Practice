import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        int value;
        value=5;
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println(value);
        System.out.print(value +"\n");
        System.out.println(value);


        // artithmetic operation


        int value1 =5;
        int value2=8;
        int totalValue= value1+value2;


        System.out.println(totalValue);




        int pie =10;
        int people =4;

        double pieperPerson =pie/(double)people;

        System.out.println(pieperPerson);


        Scanner keyboard = new Scanner(System.in);



        // caculating the total cost for the item
        System.out.println("Enter the cost for brocolli");
        int brocolloCost = keyboard.nextInt();

        System.out.println("Enter cost of cocumber");
        int cucmberCost =keyboard.nextInt();


        int totalCost =brocolloCost + cucmberCost;


        System.out.println(totalCost);





        // This is to enter the name of the school
        keyboard.nextLine();
        System.out.println("Enter the name of school");
        String nameOfSchool =keyboard.nextLine();
        System.out.println(nameOfSchool);




        //using the if else statment to check a condtion
        int values =3;
        if(values >= 5){
            System.out.println(value);
        }
        else{
            System.out.println("The number is not greater than 5 or eqaul to 5");
        }
     



        // string comparation

        String name1 ="Victor";
        String name2 ="Victor";




        if(name1.compareTo(name2) == 0){
            System.out.println("They are both equal to each other");

        }
        else{
            System.out.println("They are not equal");
        }



        // switch statment 
        int number =3;
        String weather;


        switch (number) {
            case 1:
                weather ="Monday";
                System.out.println(weather);
                break;
            case 2:
               weather ="tuesday";
               System.out.println(weather);
               break;

            case 3:
               weather="wednesday";
               System.out.println(weather);
               break;
            default:
                weather="thurday";
                System.out.println(weather);
                break;
        }



        // format specifier

        double number4 =234.564;
        System.out.printf("%011.4f", number4);





        // for loop to display set of number
        for(int i=0; i <= 100; i+= 10){

            System.out.println(i);
        }


        // do while loop
        int x=2;
        do {

            System.out.println("enter a number");
            x=keyboard.nextInt();            
        } while (x > 0);



        int y=20;
        while(y>=0){

            System.out.println(y);

            --y;
        }


        

        keyboard.close();
    }
}