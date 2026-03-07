package eu.ase.poli;

public class plane extends vehicle{
    private float capacity;
    private int engineNo;

    public plane(int weight, float capacity, int engineNo){
        super(weight);
        this.capacity=capacity;
        this.engineNo=engineNo;
    }

    @Override
    public String display(){
        return new String("Plane-weight: " + this.getWeight()+", capacity: "+this.capacity+ ", engine number: "+this.engineNo);
    }
}
