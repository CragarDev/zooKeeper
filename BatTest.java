public class BatTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("====== Starting BatTest main ======");
        System.out.println("");
        System.out.println("--- BatTest main ---");
        System.out.println("");

        // Create a BatTest class to instantiate a bat and have it attack three towns,
        // eat two humans, and fly twice.
        Bat bat1 = new Bat();
        bat1.displayEnergy();
        bat1.attackTown(3);
        bat1.displayEnergy();
        bat1.attackTown(12);
        bat1.displayEnergy();
        bat1.attackTown(8);
        bat1.displayEnergy();
        bat1.eatHumans(9);
        bat1.displayEnergy();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.displayEnergy();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.fly();
        bat1.Greeting();
        bat1.displayEnergy();

        System.out.println("");
        System.out.println("====== End BatTest main ======");
        System.out.println("");
    }
}