public class Employee extends Person {
    private String Employeeid;
    private String SupervisorID;
    private float income;

    public Employee(String ln, String fn, String empid, Integer a) {
        Employeeid = empid;
        setname(fn, ln);
        age = a;
    }

    public String getEmployeeid() {
        return Employeeid;
    }

    public void printall() {
        String name = fullname();
        System.out.println("Name: " + fullname());
        System.out.println("Age: " + age);
        System.out.println("ID: " + Employeeid);
        System.out.println("SupervisorID:" + SupervisorID);
        System.out.println("Income: " + income);
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public void setSupervisorID(String supervisorID) {
        SupervisorID = supervisorID;
    }

    public float getIncome() {
        return income;
    }

    public String getSupervisorID() {
        return SupervisorID;
    }

    public void IncreaseIncome(float incr) {
        this.income += incr;
    }
}
