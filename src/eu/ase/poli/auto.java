package eu.ase.poli;

public class auto extends vehicle{
    private int doorsNo;

    public auto(){

    }
    public auto(int weight, int doorsNo) throws Exception{
        super(weight);//apeleaza constructorul cu param din vehicle
        if(doorsNo<0){
            throw new Exception("the doorsNo must not be less than 0.");
        }
        this.doorsNo=doorsNo;
    }

    public int getDoorsNo(){
        return this.doorsNo;
    }

    public void setDoorsNo(int doorsNo)throws Exception{
        if(doorsNo<0){
            throw new Exception("the doorsNo must not be less than 0.");
        }
        this.doorsNo=doorsNo;
    }
    @Override
    public String display(){
        return new String("auto-weight: "+this+getWeight()+", doorsNumber: " + this.doorsNo);
    }
}
