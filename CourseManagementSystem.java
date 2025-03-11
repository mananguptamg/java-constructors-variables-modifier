class Course {
    private String courseName;
    private int duration; // duration in months
    private double fee;
    private static String instituteName = "";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("-------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class CourseManagementSystem {

    public static void main(String[] args) {
        // Create instances of Course
        Course course1 = new Course("Java Programming", 3, 15000.0);
        Course course2 = new Course("Web Development", 6, 20000.0);

        // Display details of each course
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Code Help");

        // Display details again after updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

//Sample Output

//Institute Name:
//Course Name: Java Programming
//Duration: 3 months
//Fee: 15000.0
//        -------------------------
//Institute Name:
//Course Name: Web Development
//Duration: 6 months
//Fee: 20000.0
//        -------------------------
//Institute Name: Code Help
//Course Name: Java Programming
//Duration: 3 months
//Fee: 15000.0
//        -------------------------
//Institute Name: Code Help
//Course Name: Web Development
//Duration: 6 months
//Fee: 20000.0
//        -------------------------