import java.util.*;

class DeleteFromArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Original array
        int arr[] = {10, 20, 30, 40, 50};
        int size = arr.length;

        // Step 2: Ask user for index to delete
        System.out.print("Enter index to delete (0 to " + (size - 1) + "): ");
        int index = sc.nextInt();

        // Step 3: Validate index
        if (index < 0 || index >= size) {
            System.out.println(" Invalid index!");
        } else {
            // Step 4: Shift elements to the left
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--; // reduce logical size of array

            // Step 5: Print updated array
            System.out.println(" Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
