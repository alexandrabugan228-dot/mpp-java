public class Programmer extends Employee {
    private int overtimeHours;

    public Programmer(){}
    public Programmer( String name, int baseSalary, int overtimeHours){
        super(name, baseSalary);
        this.overtimeHours=overtimeHours;
    }

    @Override
    public double computeSalary(){
        System.out.println("compute salary: "+(getBaseSalary()+overtimeHours*20));
        return getBaseSalary()+overtimeHours*20;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Programmer other=(Programmer) obj;
        if(overtimeHours!=other.overtimeHours){
            return false;
        }
        return true;
    }
    //metoda equals() compara atributele
    //==compara obiectele dpdv al zonei de memorie unde sunt stocate


}
