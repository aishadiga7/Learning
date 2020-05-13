package example;

public class PetrolEngine implements Engine {

    int power;
    int torque;

    public PetrolEngine(int power, int torque, int z) {
        this.power = power;
        this.torque = torque;
    }
}
