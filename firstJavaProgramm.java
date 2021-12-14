class firstJavaProgramm {
    public static void main(String[] args) {
        Animal obj =new Animal();
        obj.start();
        System.out.println("x");
    }

}
class Animal extends Thread{
    public void run(){
        System.out.println("my first ever thread created on my nw Macbook pro.");
    }
}