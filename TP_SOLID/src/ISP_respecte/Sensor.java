package ISP_respecte;


import java.util.Random;

public class Sensor
{
    public void register(Proximity door) // On utilise l'interface Proximity ici
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}

