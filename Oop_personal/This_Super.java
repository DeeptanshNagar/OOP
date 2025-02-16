class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a) {
        // a = v;
        this.a = a;
    }
    public int returnOne() {
        return 1;
    }
}


public class This_Super {
    public static void main(String[] args) {
        EkClass e = new EkClass(8);
        System.out.println(e.getA());
    }
}
