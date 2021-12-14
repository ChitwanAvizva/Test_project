// import org.graalvm.compiler.phases.common.VerifyHeapAtReturnPhase;

abstract class vehicle 
{
    int no_of_tyres;
    abstract void start();
     
    public static void main(String[] args) {
        scooter s=new scooter();
        s.start();
        car c=new car();
        c.start();
        
        System.out.println("this is main class.");
    }

    
}
class car extends vehicle{

    @Override
    void start() {
        System.out.println("Car startes with key.");
        // TODO Auto-generated method stub
        
    }
    
}
class scooter extends vehicle{

    @Override
    void start() {
        System.out.println("scooter starts with kick.");
        // TODO Auto-generated method stub
        
    }



}
