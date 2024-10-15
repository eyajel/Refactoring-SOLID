package LSP_respecte;

public class VraiDuck implements Duck
{
    @Override
    public void quack()
    {
        System.out.println("Quack...");
    }

    @Override
    public void swim()
    {
        System.out.println("Swim...");
    }
}
