package array;

public class twoDimesionalArray {

    int[][] array =null;


    public twoDimesionalArray(int row, int colom){
        array = new int[row][colom];

        for(int i =0; i < array.length; i++){
            for(int j=0; j<array[0].length;j++){
                array[i][j] =Integer.MIN_VALUE;
            }
        }
    }


    public void insert(int row, int colom, int value){
        try{
            if(array[row][colom] == Integer.MIN_VALUE){
              array[row][colom] =value;
              System.out.println("Value has been inserted");
            }
            else{
              System.out.println("Value is been occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");

        }


    }

    public void traversal(){
        for(int i =0; i < array.length; i++){
            for(int j=0; j<array[0].length;j++){
                System.out.println(array[i][j]);
            }
        }
    }

    public void searchArray(int number ){
        for(int i =0; i < array.length; i++){
            for(int j=0; j<array[0].length;j++){
                 if(array[i][j] == number){
                    System.out.println("Value has been found in row " + i + " colomn " + j);
                    return;
                 }
            }
        }

    }
    
}
