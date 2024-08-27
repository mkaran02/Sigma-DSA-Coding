public class linearsearch {

    public static int linear(int numbers[],int key)
    {
        for (int i = 0; i < numbers.length; i++) 
        {
           if(numbers[i]== key)
           {
            return i;
           } 
        }
        return -1;
    }

    public static void main(String args[])
    {

        int numbers[]={2,4,6,8,10,12,14,16};
        int key=20; //this no at bhich position we get i.e. index of this number

        int index=linear(numbers, key);  //we have passed array and no which has to find its position in function
        if(index==-1)
        {
            System.out.println("Key is not found");
        }
        else
        {
            System.out.println("Key is at index " +index);
        }

    }
    
}
