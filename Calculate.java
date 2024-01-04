public abstract class Calculate {

    private String emp_name;
    private int age;

    private int emp_id;
    private String emp_type;
    private String emp_phone;
    public String getEmp_name() {
        return emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public Calculate(){
        this.emp_id = 0;
        this.emp_name = "N/A";
        this.age = 0;
        this.emp_type = "N/A";
        this.emp_phone = "N/A";
    }

    public Calculate(int emp_id, String emp_name, int age, String emp_type, String emp_phone){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.age = age;
        this.emp_type = emp_type;
        this.emp_phone = emp_phone;
    }

    public abstract double salary();

}
