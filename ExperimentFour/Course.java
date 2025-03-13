class Course {
    // Attributes of the Course class
    private String courseName;
    private String courseCode;

    // Constructor to initialize the Course object
    public Course(String courseName, String courseCode) {
        this.courseName = courseName; // 'this' refers to the instance variable
        this.courseCode = courseCode; // 'this' refers to the instance variable
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating an object of the Course class
        Course course = new Course("Introduction to Programming", "CS101");
        
        // Displaying the course details
        course.displayCourseDetails();
    }
}