class drill2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hEllo";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int len = s1.length();
        System.out.println(len);
        System.out.println(s1.substring(0,3));
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        char ch = s2.charAt(1);
        System.out.println(ch);
    }
} 