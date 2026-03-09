public class ProgMain {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("nume1", 3000, 13);
        Programmer p2 = new Programmer("nume2", 4500, 20);
        Manager m1 = new Manager("nume3", 5000, 1200);
        Programmer p3 = new Programmer("nume1", 3000, 13);

        Employee[] e = {p1, p2, m1};
        for (int i = 0; i < e.length; i++) {
            e[i].display();
            e[i].computeSalary();
        }
        System.out.println("==" + (p1 == p3));
        System.out.println("equals: " + p1.equals(p3));

        Employee e1=new Programmer();
        if(e1 instanceof Programmer) {
            Programmer p = (Programmer) e1;
            p.display();
        }else {
            System.out.println("employee is nit a programmer");
        }
    }
}
