import java.util.*;
public class arraysmall {
    public static int smallest(int numbers[])
    {
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        return min;
    }
    public static void main(String[] args) 
    {
        
        int numbers[] = {2, 3, 4, 5, 6};
        System.out.println("Smallest Number is " +smallest(numbers));
    }

    
}
  
    

