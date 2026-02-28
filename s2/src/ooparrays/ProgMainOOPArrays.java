package ooparrays;

public class ProgMainOOPArrays {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student("S0", new short[]{5, 5, 9});
        students[1] = new Student("S1", new short[]{9,10,9});

        for(int i=0; i<students.length;i++){
            System.out.println("Avg mark for student  "+ i+ " is " + students[i].getAvgMarks());

        }

        System.out.println(students[0].toString());

        System.out.println(students[0]);

        Student s3= new Student("S0", new short[]{5,5,9});
        System.out.println(" == " + (students[0] == s3));// este fals pentru ca se compara adresele
        System.out.println("equals " + students[0].equals(s3)); //e true pt ca se compara campurile studentilor si sunt lfl
        System.out.println("s[0] hashcode: " + students[0].hashCode());
        System.out.println("s3 hashcode: " + s3.hashCode());//cand sunt egale prin equals au acelasi hash

        try{
            Student clone = (Student)students[0].clone();
            System.out.println(clone);
            System.out.println(" == " + (students[0] == clone));
            //nu e aceeasi adresa pentru ca am facut deep copy si am alocat alta zona de memorie cu new
            System.out.println("equals "+ students[0].equals(clone));
        }
        catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }

    }
}
