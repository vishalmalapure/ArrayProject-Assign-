import java.util.*;

public class FrequencyCount
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        boolean visited[] = new boolean[a.length];// initially it is set to false

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Element frequencies:");
        for (int i = 0; i < a.length; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true; // Mark as counted( it should not be counted again)
                }
            }

            System.out.println(a[i] + " occurs " + count + " time(s)");
        }
    }
}
