public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos un objeto de la clase Aritmetica
        Aritmetica aritmetica = new Aritmetica();

        //Llamamso al metodo sumar y recibimos el valor devuelto
        int resultado = aritmetica.sumar(5,3);
        System.out.println("resultado = " + resultado );
    }
}
