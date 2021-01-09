public class SobrecargaConstructores {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Enrique", 25);
        System.out.println("persona1 = " + persona1);

        Empleado empleado1 = new Empleado("Diana", 24, 20000);
        System.out.println("empleado1 = " + empleado1);

    }


}
