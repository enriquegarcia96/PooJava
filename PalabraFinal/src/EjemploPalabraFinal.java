public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //modificar un atributo final, no es posible
        //ClaseFinal.VAR_PRIMITIVO = 100;

        // modificar la referencia de un stributo de tipo object, no es posible
        //ClaseFinal.VAR_PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("Diana");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Marleny");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());


    }
}
