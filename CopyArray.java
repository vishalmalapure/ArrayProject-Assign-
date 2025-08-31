public class CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50,60,22,90};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Display copied array
        for (int i =0;i<original.length;i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
