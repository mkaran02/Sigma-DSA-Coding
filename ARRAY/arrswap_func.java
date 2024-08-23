class  swapping
{
    
    void swapp(); //fucntion declare
    public static void main(String[] args) 
    {
        int arr[]={10,20};

        int x,y;
        x=swapp(arr[0]);
        y=swapp(arr[1]);
        System.out.println(x);
        System.out.println(y);
        
    }
        swapp(arr[]) //fucntion define
        {
            int temp;

        
        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        }
    }
