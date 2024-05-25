package array;

public class main {
    public static void main(String[] args) {
        singlDimesionArray sda = new singlDimesionArray(6);

        sda.insert(0, 3);
        sda.insert(1, 4);
        sda.insert(2, 5);

        // first element been accessed
        // int number1 =sda.array[0];
        // System.out.println(number1);

        // //second element been accessed
        // int number2 =sda.array[1];
        // System.out.println(number2);

        // System.out.println("\n");

        // sda.traveral();

        sda.searchInArray(3);


        twoDimesionalArray tda = new twoDimesionalArray(3, 3);

        tda.insert(0, 0, 8);

        System.out.println(tda.array[0][0]);

        tda.insert(0,1 , 6);
        System.out.println(tda.array[0][1]);

        System.out.println("\n");
        tda.traversal();

        System.out.println("\n");
        tda.searchArray(6);

    }
    
}
