class  swap
{
    public static void main(String[] args) 
    {
        int arr[]={10,20};
        int temp;
        
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;

        System.out.println(arr[0]);
        System.out.println(arr[1]);


    }
}