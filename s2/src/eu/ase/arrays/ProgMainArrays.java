package eu.ase.arrays;

import java.util.Arrays;

public class ProgMainArrays {
    public static void main(String[] args){
        int[] v;
        v=new int[5]; // inainte sa initializam vectorul, toate valorile lui sunt 0 si lf e si pt valori
        int[] n ={10,20,30};
        n[0]=10;
        //0 -> v.lenght-1
        //System.out.println(v[5]);
        for(int i=0; i<v.length; i++){
            System.out.println(i+ " " + v[i]);
        }
        for(int x:v){
            System.out.println(x);
        }
        int[] v2;
        //int[] v2 = v; //creeaza doar un pointer nou la adresa lui v, nu un vectpr
        //vectro nou se face cu new

        //v2 = Arrays.copyOf(v, v.length);
        //System.arraycopy(v, 0, v2, 0, v.length);
        v2=v.clone();
        v2[0]=50;
        System.out.println("v: ");
        for(int i=0;i<v.length; i++){
            System.out.println(i+" "+v[i]);
        }
        System.out.println("v2: ");
        for(int i=0;i<v2.length; i++){
            System.out.println(i+" "+v2[i]);
        }
        modifyArray(v);
        System.out.println(v[0]);

    }

    private static void modifyArray(int[] arr) {
        arr[0]=999;
        //arr=new int[10];
    }
}
