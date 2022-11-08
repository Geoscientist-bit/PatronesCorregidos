package Adapter;

public class PowerAdapter implements  Enchufable{
    Lightbuild lightbuild = new Lightbuild();

    @Override
    public void enciende() {
        lightbuild.turnOn(110);

    }

    @Override
    public void apaga() {
        lightbuild.turnOff();

    }

    @Override
    public boolean estaEncendido() {
        return lightbuild.ispoweredOn();
    }
}
