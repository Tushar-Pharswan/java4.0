package oops.calsses;

public class game {
    void run() {

    }
    void punch(){

    }
    void shoot(){
        System.out.println("shooter ");

    }

    static class amit extends game{
        void drive(){
            System.out.println("Best driver ");
        }
        void pilot(){
            System.out.println("pro pilot ");
        }
        void shoot (){
            System.out.println(" Amit is pro shooter ");
        }
    }
    static class chiki extends game{
        void pilot(){
            System.out.println("avg pilot ");
        }
        void shoot(){
            System.out.println("chikki is a noob shooter ");
        }   
    }
    static class tushar extends game{
        void planer(){
            System.out.println("heist planner ");
        }
    }
    public static void main(String[] args) {
        amit a1=new amit();
        chiki c1=new chiki();
        tushar t1=new tushar();
        a1.drive();
        a1.pilot();
        c1.pilot();
        c1.shoot();
        t1.shoot();
        
    }
}

