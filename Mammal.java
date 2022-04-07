public class Mammal {

    // Create a Mammal class that has an energyLevel member variable
    // and displayEnergy() method.
    // The displayEnergy() method should show the animal's energy level as well as
    // return it.

    private int energyLevel;

    // Constructor
    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    // Plain ole greeting
    public void Greeting() {
        System.out.println("");
        System.out.println("--- Mammal says: Hello, How are you?");
        System.out.println("");
    }
}