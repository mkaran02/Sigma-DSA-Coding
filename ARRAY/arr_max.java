import java.util.Scanner;

class Arrmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter the elements in array:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) 
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("Max is " +max);
    }
}
