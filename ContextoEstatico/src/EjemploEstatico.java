public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Diana");
        System.out.println(persona1);

        Persona persona2 = new Persona("Marleny");
        System.out.println(persona2);

        System.out.println("ContadorPersona = " + Persona.getContadorPersonas());
    }
}

class Persona{
    private int idPersona;
    private String nombre;

    // si no fuera de tipo statico entonces se asocia con el objeto y se reiniciaria el contador
    private static int contadorPersonas; // static se asocia con la clase (Persona)

    public Persona( String nombre ){
        this.idPersona = contadorPersonas++;
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    public void setIdPersona( int idPersona ){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public String toString (){
        return "idPersona: " + idPersona + " Nombre: " +nombre;
    }




}