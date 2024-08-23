class reverse1
{
    public static void main(String args[])
    {
        int arr[]={-3,4,2,8,3,9,6,2,8,10};
        int i;

        System.out.println("Given array:");
        for ( i = 0; i <=arr.length; i++)
        {
            System.out.println(arr[i]  );
            
        }

        void reverse(int arr[], int start, int end)
    {
         start=3,end=7;
         int temp;
       
        
       while(i<end)
       {

        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }

System.out.println("Reversed array :");
for(i=0;i<=arr.length;i++)

System.out.println(arr[i]);
}
}