public class CountOccurences {

    public static void main(String[] args) {

        int[] array = {2, 3, 2, 5, 2, 6};

        int target = 2;

        int count = 0;

        for (int num : array) {   // for-each loop is used to iterate through each element of array
                                  // num takes the value of each element in array one by one.
            if (num == target) {

                count++;

            }

        }
        System.out.println("Occurrences of " + target + ": " + count);
    }
}