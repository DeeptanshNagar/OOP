class Student2 {
    void study() {
        System.out.println("Student is studying.");
    }

    void attendClass() {
        System.out.println("Student is attending class.");
        this.study(); // Using this to invoke the instance method
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.attendClass(); // Calls attendClass(), which then calls study() using this
    }
}

