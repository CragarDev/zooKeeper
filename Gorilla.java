public class Gorilla extends Mammal {

    // Create a separate class Gorilla that can
    // throwSomething(), eatBananas(), and climb()

    // For the throwSomething() method, have it print out a message indicating
    // that the gorilla has thrown something, as well as decrease the energy level
    // by 5
    public void throwSomething() {
        this.setEnergyLevel(this.getEnergyLevel() - 5);
        System.out.println("");
        System.out.println("I'm a Gorilla and I just threw something!");
        System.out.println("");
        System.out.println("Energy level: " + this.getEnergyLevel());
    }

    // For the eatBananas() method, have it print out a message indicating
    // the gorilla's satisfaction and increase its energy by 10
    public void eatBananas() {
        this.setEnergyLevel(this.getEnergyLevel() + 10);
        System.out.println("");
        System.out.println("Hmmm Hmm, those bananas are delicious");
        System.out.println("");
        System.out.println("Energy level: " + this.getEnergyLevel());
    }

    // For the climb() method, have it print out a message indicating =
    // the gorilla has climbed a tree and decrease its energy by 10
    public void climb() {
        this.setEnergyLevel(this.getEnergyLevel() - 10);
        System.out.println("");
        System.out.println("I just climbed a tree!");
        System.out.println("");
        System.out.println("Energy level: " + this.getEnergyLevel());
    }

    // Plain ole greeting
    public void Greeting() {
        System.out.println("");
        System.out.println("--- Gorilla says: Hello, How are you?");
        System.out.println("");
    }
}