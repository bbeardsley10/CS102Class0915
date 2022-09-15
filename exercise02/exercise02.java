package exercise02;

/**
 * exercise02
 */
public class exercise02 {

    public static void main(String[] args) {

        int[] myArray = {5, -5, 2, 12, 18, -10};
        
        //Calculate the sum of all numbers in the array
        int sum = 0;

        for (int i = 0; i < myArray.length; i++)
        {
            
             sum += myArray[i];
        }
        System.out.println(sum);
    }
}