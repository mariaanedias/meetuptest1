package questions.java.I;

class Laptop {
    String memory = "1GB";
}

public class Q42 {
    public static void main(String args[]) {
        Laptop life = new Laptop();
        repair(life);
        System.out.println(life.memory);
    }
    
    public static void repair(Laptop laptop) {
        laptop.memory = "2GB";
    }
}
