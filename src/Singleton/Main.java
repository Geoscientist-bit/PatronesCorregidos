package Singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
        //singleton.setContador(15);
        //System.out.println(singleton.getContador());

        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);

        Singleton singleton1 = Singleton.getInstance();


        System.out.println("valor: " + singleton.getContador() + " en memoria: " + singleton);
        System.out.println("valor: " + singleton1.getContador() + " en memoria: " + singleton1);

        Aplication aplication = Aplication.getInstance();
        Aplication aplication2 = Aplication.getInstance();

        System.out.println(aplication + " " + aplication2);
    }
}
