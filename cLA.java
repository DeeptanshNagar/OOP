public class cLA {
    public static void main(String[] args) {
        System.out.println("There are "+ args.length + " number of command line arguements.");
        System.out.println("They are : ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]:" + args[i]);
        }
    }
}
