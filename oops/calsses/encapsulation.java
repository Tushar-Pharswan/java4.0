package oops.calsses;

public class encapsulation {

    public static void main(String[] args) {
        demo d1 = new demo();
        d1.setName("anand");
        System.out.println(d1.getName());
    }
}

class demo {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // //getter & setter
    // public void setName(String name) {
    // this.name = name;
    // }

    // public String getName() {
    // return this.name;
    // }

    // public void setAge(int age) {
    // this.age = age;
    // }

    // public int getage() {
    // return this.age;
    // }
}
