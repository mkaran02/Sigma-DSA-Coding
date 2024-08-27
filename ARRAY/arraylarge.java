import java.util.*;
public class arraylarge {
    public static int largest(int numbers[])
    {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++)
        {
            if(max<numbers[i])
            {
                max=numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        
        int numbers[] = {2, 3, 4, 5, 6};
        System.out.println("Largest Number is " +largest(numbers));
    }

    
}
