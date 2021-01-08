import javax.naming.PartialResultException;

public class PruebaAritmetica {
    public static void main(String[] args) {

        //variables locales
        int operandoA = 6;
        int operandoB = 2;

        //creamos un objeto de la clase Aritmetica enviado argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //imprimimos los valores de los objetos
        System.out.println("objetoA = " + operandoA);
        System.out.println("objeto B = " + operandoB);

        // imprimimos el resultado suma
        System.out.println(" \nResultado suma: " + objeto1.sumar());

        //imprimimos el resultado de la resta
        System.out.println("\nResultado resta = "+objeto1.restar());

        // imprimimos el resultado de la division
        System.out.println("\nResultado division = " +objeto1.dividir());

        //imprimimos el resultado de la multiplicacion
        System.out.println("\nResultado multiplicacion = " + objeto1.multiplicar());
    }


}
