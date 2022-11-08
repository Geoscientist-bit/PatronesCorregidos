package Decorator;

public class TelefonoNextgen extends TelefonoDecorator{
    public TelefonoNextgen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("-> Nextgen: tengo tambien 5G");
        System.out.println("-> Nextgen: tengo tambien VolTE");
    }
}
