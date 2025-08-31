import java.util.*;

public class ArrThirdSmallestWithDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (a[i] < first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] < second) {
                third = second;
                second = a[i];
            } else if (a[i] < third) {
                third = a[i];
            }
        }

        System.out.println("Third smallest (with duplicates) element is: " + third);
    }
}
//if the element are duplicates given not
//if (a[i] < first) {
    second = first;
    first = a[i];
} else if (a[i] < second && a[i] != first) {
    second = a[i];
}
--------------->
// if the element are duplicates given 
if (a[i] < first) {
    second = first;
    first = a[i];
} else if (a[i] < second) {
    second = a[i];
}

