public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 3,5, 3, 4, 3, 5, 6};
        int repeating = -1;

        // Outer loop picks elements one by one
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop compares with remaining elements
            for (int j = i + 1; j < arr.length; j++)
		 {
                if (arr[i] == arr[j])
			 {
                    repeating = arr[i]; // Found the first repeating element
                    break;              // Break inner loop
                	}
                 }
                if (repeating != -1) 
                    break; // Break outer loop too once first repeat is found
        }

        if (repeating != -1) {
            System.out.println("First repeating element is: " + repeating);
        } else {
            System.out.println("No repeating elements found.");
        }
    }
}
