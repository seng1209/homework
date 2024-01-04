public class EmployeePartTime extends Calculate{

    public int getHours_rate() {
        return hours_rate;
    }

    public void setHours_rate(int hours_rate) {
        this.hours_rate = hours_rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private int hours_rate;
    private double rate;

    public EmployeePartTime(){
        super();
        this.hours_rate = 0;
        this.rate = 0;
    }

    public EmployeePartTime(int emp_id, String emp_name, int age, String emp_type, String emp_phone, int hours_rate, double rate){
        super(emp_id, emp_name, age, emp_type, emp_phone);
        this.hours_rate = hours_rate;
        this.rate = rate;
    }
    @Override
    public double salary() {
        return this.rate * this.hours_rate;
    }

    public String ToString(){
        return super.getEmp_id() + " " + super.getEmp_name() + " " + super.getAge() + " " + super.getEmp_type() + " " + super.getEmp_phone() + " " + getHours_rate() + " " + getRate() + " " + salary();
    }
}
