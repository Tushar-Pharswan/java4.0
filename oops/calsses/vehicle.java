package oops.calsses;

public class vehicle {

    boolean start() {
        return false;
    }

    int speed(int a) {
        return a;
    }

    int wheelCount(int a) {
        return a;
    }

    static class car extends vehicle {
        boolean start(boolean check) {
            return check;
        }

        int speed(int a) {
            return a+10;
        }

        int wheelCount(int a) {
            return a;
        }

    }

    static class bike extends vehicle {
        boolean start(boolean check) {
            return check;
        }

        int speed(int a) {
            if (start()==true) {
                return a+5;
            } else
            System.out.println("bike cant start ");
                return -1;
        }

        int wheelCount(int a) {
            return a;
        }
    }

    public static void main(String[] args) {

        // object

        vehicle v1 = new vehicle();
        //v1.start();

        car c1 = new car();// class ka object create kr rha hu

        bike b1 = new bike();
        System.out.println(b1.start(false));
        System.out.println(b1.speed(10));

    }
}
