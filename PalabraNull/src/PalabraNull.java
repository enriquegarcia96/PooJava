public class PalabraNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Diana");
        System.out.println("Persona1 = " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("Persona 2 = " + persona2.obtenerNombre());


        //Hacemos Persona1 ya no apunte al objeto persona
        persona1 = null; // es caditada para la elimine el recolector de basura
        System.gc(); // garbage collector solo planifica la llamada
        persona2 = null;

        if (persona1 != null){
            System.out.println("persona2 = "+ persona1.obtenerNombre());
        }
    }
}

class Persona{
    String nombre;

    Persona( String nombre ){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}
