package eu.ase.oop;

import java.security.cert.Certificate;

public class certificate {

    private int id;
    private String name;

    public certificate( int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public certificate myClone(){
        certificate newCert = new certificate(this.id, this.name);
                return newCert;
    }

    @Override
    public boolean equals(Object obj){
        certificate c=(certificate) obj;
        if(this.id==c.id && this.name.equals(c.name)){
            return true;
        }
        return false;
    }



}
