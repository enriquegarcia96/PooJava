public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    Aritmetica(){

    }

    // Constructor con 2 Argumentos
    Aritmetica(int a, int b){
         this.a = a;
         this.b = b;
    }

    // Este metodo sumar toma los atributos de la clase
    int sumar (){
        return (a + b);
    }

    // metodo restar
    int restar (){
        return a-b;
    }

    // metodo multiplicar
    int multiplicar(){
        return a*b;
    }

    //metodo dividir
    int dividir(){
        return a/b;
    }


}
