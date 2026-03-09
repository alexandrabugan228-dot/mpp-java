public class Employee implements Payable {
    private String name;
    private int baseSalary;

    public Employee(){}

    public Employee(String name, int baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public void display(){
        System.out.println("employee-name: "+name+", base salary: "+baseSalary);
    }
    @Override
    public double computeSalary(){
        System.out.println("employee - computeSalary");
        return baseSalary;
    }

    public int getBaseSalary(){
        return this.baseSalary;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return (Employee) super.clone();
    }

}
