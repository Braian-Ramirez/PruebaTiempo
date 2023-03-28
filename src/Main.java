public class Main {
    public static void main(String[] args) {

        Tiempo1 tiempo = new Tiempo1();

        System.out.println("La hora universal inicial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("La hora estandar inical es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        tiempo.establecerTiempo(20,45,2);
        System.out.println("La hora universal después de establecer tiempo es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("La hora estandar después de establecer tiempo es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        tiempo.establecerTiempo(99,99,99);
        System.out.println("Después de intetar ajustes invalidos ");
        System.out.println("Hora univerdsal: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("Hora estandar: " );
        System.out.println(tiempo.toString());

    }
}