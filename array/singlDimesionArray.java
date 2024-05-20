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

    public void display(){
        // for(){

        // }
    }
}
