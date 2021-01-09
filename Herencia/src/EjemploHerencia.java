import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("kike", 25000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Barrio las flores");
        System.out.println("empleado1= " + empleado1);


        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Marleny");
        cliente1.setEdad(24);
        cliente1.setGenero('F');
        cliente1.setDireccion("Barrio las flores");
        System.out.println("cliente1= " + cliente1);
    }
}
