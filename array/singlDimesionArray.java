package array;

public class singlDimesionArray {
    int[] array=null;
    
    public singlDimesionArray(int size){
        array =new int[size];

        for(int i =0; i < size; i++){
            array[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int location , int value){
        try{
            if(array[location] == Integer.MIN_VALUE){
            array[location] =value;
              System.out.println("the value has been inserted");
        }

        else{
            System.out.println("the space is already occpied");
        }

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array is out of bound");
        }

    }

    // array traversal
    public void traveral(){
        for(int i=0; i < array.length; i++){
               System.out.println(array[i]);
        }
    }


    public void searchInArray(int valueToSearch){
        for(int i=0; i <array.length; i++){
            if(array[i] == valueToSearch){
                System.out.println("Value was found in the array in index " + i);
                return;
            }

         
        }
        System.out.println("Value was not found in the array ");
    }
}
