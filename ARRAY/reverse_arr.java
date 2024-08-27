import java.util.*;
public class reverse_arr {

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;

        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};

        reverse(arr);
        System.out.println("Reversed array :");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(+arr[i]);
        }

    }

}
