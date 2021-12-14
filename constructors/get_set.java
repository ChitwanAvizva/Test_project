package constructors;

public class get_set {
    String name;
    int a;
   public get_set(String name,int a){
       this.name=name;
       this.a=a;
   }
    public static void main(String[] args) {

        // dwfault constructors
        set_get obj1= new set_get();
        System.out.println(obj1);
        // obj.Name;
        // obj1.age;
        // parameterised constructors
        get_set obj=new get_set("chitwan Singh",23);
        System.out.println(obj.name);
        System.out.println(obj.a);
        
    }
    
}
 class set_get{
     String Name;
     int age;
     public set_get(){
        this.Name=Name;
        this.age=age;
     }

}
