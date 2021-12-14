package practice;

public  abstract class species {

    abstract void eat();
    abstract void sleep();
    abstract void work();

    public static void main(String[] args) {
        human h=new human("chitvan.");
        h.eat();
        h.sleep();
        h.work();
        
    }
    
}
class human extends species{
    String name;

    public human(String name){
        this.name=name;
    }

    @Override
    void eat() {
        System.out.println(name+" eats.");

        // TODO Auto-generated method stub
        
    }

    @Override
    void sleep() {
        System.out.println(name+" sleeps.");
        // TODO Auto-generated method stub
        
    }

    @Override
    void work() {
        System.out.println(name+" works.");
        // TODO Auto-generated method stub
        
    }
    

}
