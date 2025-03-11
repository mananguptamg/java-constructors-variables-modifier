public class UniversityManagementSystem {

    public static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }
    }

    public static class PostgraduateStudent extends Student {

        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }

        public void displayStudentDetails() {
            System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Manan", 3.8);
        student1.setCGPA(3.9);
        System.out.println("Student Details: Roll Number = " + student1.rollNumber + ", Name = " + student1.name + ", CGPA = " + student1.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Naman", 3.7);
        pgStudent.displayStudentDetails();
    }
}

// Sample Output
//Student Details: Roll Number = 101, Name = Manan, CGPA = 3.9
//Roll Number: 201, Name: Naman, CGPA: 3.7