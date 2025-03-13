class Student2 {
    // Static variable shared among all instances
    private static String universityName = "Global University";
    
    // Non-static variable unique to each instance
    private String studentName;
    
    // Constructor
    public Student2(String studentName) {
        this.studentName = studentName;
    }
    
    // Static method to display the university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }
    
    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }
    
    public static void main(String[] args) {
        // Display university name using static method
        Student2.displayUniversityName();
        
        // // Creating student objects
        // Student2 student1 = new Student2("keshav");
        // Student2 student2 = new Student2("Jindal");
        // Student2 student3 = new Student2("Virat");
        
        // // Display student details
        // student1.displayStudentInfo();
        // student2.displayStudentInfo();
        // student3.displayStudentInfo();
        
        // // Modifying the static variable
        // Student2.universityName = "International University";
        
        // // Display student details again to show the updated static variable
        // student1.displayStudentInfo();
        // student2.displayStudentInfo();
        // student3.displayStudentInfo();
    }
}
