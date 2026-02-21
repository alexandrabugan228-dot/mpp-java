package eu.ase.oop;

public class PropMainCertificate {
    public static void main(String[] args){
        certificate c1 = new certificate (777, "c1");
        certificate c2 = new certificate(999, "c2");

        System.out.println(c1);
        System.out.println("c1:"+c1.getId()+" "+c1.getName());
        c2=c1;
        System.out.println(c2);
        c2.setId(333);
        System.out.println("c1:"+c1.getId()+" "+c1.getName());
        System.out.println("c2:"+c2.getId()+" "+c2.getName());

        certificate c3 = c1.myClone();
        System.out.println("c3:"+c3.getId()+" "+c3.getName());
        System.out.println(c3);
        // c3.setId(555);
        System.out.println("c1:"+c1.getId()+" "+c1.getName());
        System.out.println("c2:"+c2.getId()+" "+c2.getName());
        System.out.println("c23:"+c3.getId()+" "+c3.getName());
        boolean eq=c1==c2;
        System.out.println(eq);
        eq=c1==c3;
        System.out.println(eq);

        boolean equals=c1.equals(c2);
        System.out.println("c1 eq c3: "+equals);
    }
}
