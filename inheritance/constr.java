package inheritance;

public class constr {
    
    String name;
    int age;

    public constr(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name+""+age);
     }
    public static void main(String[] args) {
        inherit obj=new inherit("chitvan singh",23,"14-03-1997");

    }
}
class inherit extends constr{


    String dob;
    public inherit(String name, int age,String dob) {
        super(name, age);
        this.dob=dob;
        System.out.println(name+" "+age+" "+dob);
        //TODO Auto-generated constructor stub
    }
    
}
