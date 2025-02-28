class drill2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1,2,3};
        int[][] table = { // a variable-length table
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        // System.out.println("length of list is " + list.length);
        // System.out.println(nums.length);
        // System.out.println(table.length);
        System.out.println(table[0].length);
        System.out.println(table[1].length);
        System.out.println(table[2].length);
    }
}
