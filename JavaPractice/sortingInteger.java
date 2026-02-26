import java.io.*;

class sortingInteger
 {
    public static void main(String[] args)
     {
        // storing input in variable
        int n = 5;

        // create integer array
        int numbers[] = { 45, 12, 67, 23, 89 };
        int temp;

        // sorting logic
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] > numbers[j]) {
                    // swapping
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // print output array
        System.out.println("The integers in ascending order are:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}