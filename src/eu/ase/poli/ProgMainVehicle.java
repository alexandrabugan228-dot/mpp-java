package eu.ase.poli;

public class ProgMainVehicle {
    public static void main(String[] args){
        auto a=null;
        try{
        a= new auto(1200, 5);
        System.out.println(a.display());
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
        vehicle v = null;
        plane p=new plane(1500, 12, 2);
        v=a; //auto este si un vehicle - upcasting
        System.out.println(v.display());
        v=p;

        vehicle v0=null;
        p = (plane )v0;//downcast = nu orice vehicle este un plane
        //p=a; -NU SE POATE!!! - class exception

        movement m = null;
        try {
            m = new auto(1900, 4);
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
        m.startEngine();
        m.stopEngine();
        }
    }

