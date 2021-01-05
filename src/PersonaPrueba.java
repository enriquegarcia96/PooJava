public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona persona1 = new Persona();

        //Llamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        persona1.desplegarNombre();

        //Modificamos valores del objeto acreado
        persona1.nombre = "Enrique Garcia";
        persona1.apellidoPaterno = "Ramirez";
        persona1.apellidoMaterno = "Romero";

        // Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto persona");
        persona1.desplegarNombre();

        //Creacion de un segundo objeto
        Persona persona2 = new Persona();
        System.out.println("\nCreacion de un nuevo objeto");
        persona2.nombre = "Diana";
        persona2.desplegarNombre();
    }
}
