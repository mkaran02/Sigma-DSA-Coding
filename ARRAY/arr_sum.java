import java.util.Scanner;

class ArrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter the elements in array:\n12");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        int sum=0;
        for (int i = 0; i < 5; i++) 
        {
            sum=sum+arr[i];
        }
        System.out.print("Sum is " +sum);
    }
}
