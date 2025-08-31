class ArrayAnagram {
    int[] arr1;
    int[] arr2;

    ArrayAnagram(int[] a, int[] b) {
        arr1 = a;
        arr2 = b;
    }

    int checkAnagram() {
        if (arr1.length != arr2.length) {
          System.out.println("Anagram Condition is not possible as the length of the two array is not same");
        }

        for (int i = 0; i < arr1.length; i++) 
{
            int found = 0;
            for (int j = 0; j < arr2.length; j++) 
           {
                if (arr1[i] == arr2[j])
		{
                    found = 1;
                    break;
                }
            }
            if (found == 0)
	   	 {
               			 return 1;
           	 }
        }

        return 0;
}

    public static void main(String[] args) {
        int[] array1 = {3, 2, 1};
        int[] array2 = {1, 3, 2};

        ArrayAnagram obj = new ArrayAnagram(array1, array2);
        int result = obj.checkAnagram();

        if (result == 0) {
            System.out.println("Arrays are anagrams (same elements, different order)");
        } else {
            System.out.println("Arrays are NOT anagrams");
        }
    }
}
