package Singleton;

public class Aplication {
    private static Aplication aplicacion;
    boolean isRunning = false;

    private Aplication(){}

    public static Aplication getInstance(){
        if (aplicacion == null) {
            aplicacion = new Aplication();
        }
        return aplicacion;
    }

    public void run(){
        if (!isRunning) {
            isRunning = true;
        }else {
            System.out.println("ya estaba en ejecución ");
        }

    }
}
