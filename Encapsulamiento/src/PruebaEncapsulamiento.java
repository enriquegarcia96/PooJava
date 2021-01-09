public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Marleny", "Gonzales", true);

        System.out.println(persona1.getNombre());
        persona1.setNombre("Diana");
        System.out.println(persona1.getNombre());

        System.out.println(persona1);// imprime de un solo el metodo ToString

        persona1.setBorrado(false);

        System.out.println(persona1);
    }
}
