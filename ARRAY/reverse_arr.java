class reverse_arr
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        int i=0;

        int j=arr.length-1;

    int temp;
    while (i<j) 
    {
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       i++;
       j--;
        
    }


System.out.println("Reversed array :");
for(i=0;i<5;i++)

System.out.println(arr[i]);
}
}