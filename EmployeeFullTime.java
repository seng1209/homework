public class EmployeeFullTime extends Calculate{
    private double monthly;

    public double getMonthly() {
        return monthly;
    }

    public void setMonthly(double monthly) {
        this.monthly = monthly;
    }

    public EmployeeFullTime(){
        super();
        this.monthly = 0;
    }

    public EmployeeFullTime(int emp_id , String emp_name, int age, String emp_type, String emp_phone, double monthly){
        super(emp_id, emp_name, age, emp_type, emp_phone);
        this.monthly = monthly;
    }

    @Override
    public double salary() {
        return monthly;
    }

    public String ToString(){
        return super.getEmp_id() + " " + super.getEmp_name() + " " + super.getAge() + " " + super.getEmp_type() + " " + super.getEmp_phone() + " " + salary();
    }

}
