public class EjemploMatrices {
    public static void main(String[] args) {
        //1. Declarar una matriz de int
        int edades[][];
        //2. instanciar la matriz de int
        edades = new int[3][2];
        //3. instanciar los valores de la matriz
        edades[0][0] = 3;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        //4. imprimir
        System.out.println("Matriz enteros indice 0 0: " +edades[0][0]);
        System.out.println("Matriz enteros indice 2 0: " +edades[2][0]);
        System.out.println("Matriz enteros indice 1 0: " +edades[1][0]);

        //1. Declaracion e instanciar matriz tipo object
        Persona personas[][] = new Persona[1][2];
        //2. inicializamos valores
        personas[0][0] = new Persona("Santos");
        personas[0][1] = new Persona("Karla");

        //3. imprimir
        System.out.println("Matriz persona indice 0 0: " +personas[0][0]);
        System.out.println("Matriz persona indice 0 1: " +personas[0][1]);
        //System.out.println("Matriz persona indice 0 1: " +personas[0][2]);

        System.out.println();
        for(int i=0; i < personas.length; i++){
            for (int j=0; j< personas[i].length; j++){
                System.out.println("Matriz personas indice: "+i+" - "+j+": "+personas[i][j]);
            }
        }

        System.out.println();
        String nombres [] [] = {{"teresa", "cesar", "william"}, {"kike", "Yesenia", "Marleny"}};
        for(int i=0; i < nombres.length; i++){
            for (int j=0; j< nombres[i].length; j++){
                System.out.println("Matriz personas indice: "+i+" - "+j+": "+nombres[i][j]);
            }
        }

    }
}
