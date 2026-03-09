public class Manager extends Employee{
    private float bonus;

    public Manager(){}
    public Manager(float bonus){
        this.bonus=bonus;
    }
    public Manager( String name, int baseSalary, float bonus){
        super(name, baseSalary);
        this.bonus=bonus;
    }
    @Override
    public double computeSalary(){
        System.out.println("compute salary: "+( getBaseSalary()+bonus));
        return getBaseSalary()+bonus;
    }
    @Override
    public void display(){
        System.out.println("manager-name: "+getName()+", base salary: "+computeSalary());
    }



}
