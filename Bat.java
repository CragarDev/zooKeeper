public class Bat extends Mammal {
    // Create a Bat class that can fly(), eatHumans(), and attackTown() and has a
    // default energy level of 300.

    // Create a constructor for Bat that takes in an energy level.
    public Bat() {
        super.setEnergyLevel(300);
    }

    // For the fly() method, print the sound a bat taking off and decrease its
    // energy by 50.
    // Create a method called fly() that decreases the Bat's energy level by 50.
    public void fly() {
        System.out.println("Flap flap flap whoosh");
        super.setEnergyLevel(super.getEnergyLevel() - 50);
    }

    // For the eatHumans() method, print the so- well, never mind, just increase its
    // energy by 25.
    public void eatHumans(int numHumansEaten) {
        System.out.println("Yum yum yum");
        super.setEnergyLevel(super.getEnergyLevel() + 25 * numHumansEaten);
    }

    // For the attackTown() method, print the sound of a town on fire and decrease
    // its energy by 100.
    // Create a method called attackTown() that calls both methods.
    public void attackTown(int numHumansEaten) {
        System.out.println("Snap crackle pop sizzle");
        System.out.println("aaahhh help me we're burning");
        fly();
        eatHumans(numHumansEaten);
    }

}
