public class EmployeeRecords {

    public static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    public static class Manager extends Employee {

        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayManagerDetails() {
            System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "IT", 50000);
        System.out.println("Employee Details: ID = " + employee.employeeID + ", Department = " + employee.department + ", Salary = " + employee.getSalary());
        employee.setSalary(55000);
        System.out.println("Updated Employee Salary: " + employee.getSalary());

        Manager manager = new Manager(102, "HR", 70000);
        manager.displayManagerDetails();
    }
}

//Sample Output
//Employee Details: ID = 101, Department = IT, Salary = 50000.0
//Updated Employee Salary: 55000.0
//Manager ID: 102, Department: HR, Salary: 70000.0