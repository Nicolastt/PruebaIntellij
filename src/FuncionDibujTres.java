import java.util.Scanner;

public class FuncionDibujTres {

    public static void main(String[] args) {
        //Declaramos un entero, cantidad de elementos.
        int n;
        //Utilizamos Scanner para capturar datos del teclado.
        Scanner num = new Scanner(System.in);
        //El try sirve para capturar las excepciones de entrada de datos.
        try {
            System.out.print("Ingresa una cantidad entera.");
            //Forma de capturar datos de teclado con Scanner.
            n = num.nextInt();
            //Llamamos la función pasando el entero capturado como argumento.
            asterisco(n);
        } catch (Exception e) {
            //En caso que el dato ingresado no sea de tipo entero, se indica el error.
            System.out.println("ERROR: se espera dato entero.");
        }
    }
    //Creamos la función al cual le pasamos un entero como argumento.
    static void asterisco(int n){
        //Creamos una variable tipo constante para utilizarla.
        final char simbolo = '*';
        //Creamos el primer for.
        //Se hace con un preincremento ++i al igual que ++j.
        for (int i = 0; i < n; ++i) {
            //Cada primer for, se hace un salto de línea.
            System.out.println();
            //Anidamos otro for con el mismo proceso.
            //Mientra "j" sea menor o igual a "i" se imprime, esto dará forma al
            //Triángulo Rectángulo..
            for (int j = 0; j <= i; ++j) {
                System.out.print(simbolo);
            }
        }
        System.out.println();
    }
}