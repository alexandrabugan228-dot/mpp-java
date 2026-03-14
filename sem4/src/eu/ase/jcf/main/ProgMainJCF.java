package eu.ase.jcf.main;

import eu.ase.jcf.classes.Country;
import eu.ase.jcf.classes.Plane;

import java.util.*;

public class ProgMainJCF {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("text");
        //list.add(10);
        //String s=(String)list.get(1);
        List<Plane> listtPlanes = new ArrayList<Plane>();
        System.out.println(listtPlanes.size());
        for(int i=0;i<20;i++){
            listtPlanes.add(new Plane(101+i,"Airbus"+i, 500.0f));
        }
        System.out.println("size after adding elem "+listtPlanes.size());
        listtPlanes.iterator();
        Plane temp=null;
        for(Iterator<Plane> it=listtPlanes.iterator(); it.hasNext();){
            temp=it.next();
            temp.print();
        }
        for(Plane p: listtPlanes){
            p.print();
        }
        Plane p1= new Plane(2, "Airbus", 300.f);
        Plane p2= new Plane(1, "Airbus", 300.f);
        Set<Plane> setPlanes = new TreeSet<Plane>();

        setPlanes.add(p1);
        setPlanes.add(p2);
        System.out.println(setPlanes.size());

        Map<Plane, Country> treeMap = new TreeMap<Plane, Country>();
        for(int i=0; i<7;i++) {
            Plane pk= new Plane(201+i, "Airbus"+i, 300.0f);
            Country cv = new Country(701+i, "Country "+i);

            treeMap.put(pk, cv);
        }

        Set<Plane>s=treeMap.keySet();
        Iterator<Plane> it=s.iterator();
        for(;it.hasNext();) {
            Plane pk=it.next();
            Country cv = treeMap.get(pk);
            pk.print();
            cv.print();
        }
        Set<Map.Entry<Plane,Country>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<Plane,Country>> itEntry = entrySet.iterator();

        for(;itEntry.hasNext();){
            Map.Entry<Plane, Country> entry= itEntry.next();
            Plane pk= entry.getKey();
            Country cv=entry.getValue();

            pk.print();
            cv.print();
        }



    }
}