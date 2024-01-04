public class Main {
    public static void main(String[] args) {
        EmployeeFullTime emp_full_time = new EmployeeFullTime(
                1,
                "Sok Dara",
                23,
                "Java Developer",
                "010836492",
                1200.00
        );
        EmployeePartTime employeePartTime = new EmployeePartTime(
                2,
                "Ly Na",
                22,
                "Designer",
                "090832325",
                53,
                5
        );

        System.out.println("Employee Full Time");
        System.out.println(emp_full_time.ToString());
        System.out.println("Employee Part Time");
        System.out.println(employeePartTime.ToString());
    }
}