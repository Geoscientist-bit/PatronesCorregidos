package Decorator;

public class Main {
    public static void main(String[] args) {
        //TelefonoBasico telefonoBasico = new TelefonoBasico();
        //telefonoBasico.crear();

        //TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        //telefonoInteligente.crear();

        TelefonoNextgen tng = new TelefonoNextgen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );
        tng.crear();





    }
}
