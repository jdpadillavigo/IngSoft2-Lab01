package pe.edu.ulima.is2;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola Software 2!");

        int a = 1;
        System.out.println(++a);

        SerHumano juan = new SerHumano(
            "Juan",
            "Marrones",
            30
        );
        System.out.println(juan.getNombre());

        SerHumano[] personas = new SerHumano[3];
        // personas[0] = null;
        // int[] numeros = new int[3];
        // String[] nombres = new String[3];
        // nombres[0] = null;
        for(SerHumano serHumano : personas) {
            System.out.println(serHumano.getNombre());
        }
    }
}