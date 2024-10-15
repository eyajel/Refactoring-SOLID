package LSP_respecte;

public class Pool
{
    public void run()
    {
        Duck vraiDuck = new VraiDuck();
        ElectronicDuck electronicDuck = new ElectronicDuck();
        electronicDuck.turnOn();  // On allume le canard électronique avant de l'utiliser

        quack(vraiDuck, electronicDuck);
        swim(vraiDuck, electronicDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
