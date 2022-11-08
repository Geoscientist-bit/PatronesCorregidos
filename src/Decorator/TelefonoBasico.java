package Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear() {
        System.out.println("soy el telefono basico. Estas son mis caracteristicas");
        tengoSMS();
        tengoGSM();

    }
    public void tengoGSM(){
        System.out.println("-> basico: tengo GSM ");
    }
    public void tengoSMS(){
        System.out.println("-> basico: tengo SMS");
    }
}
