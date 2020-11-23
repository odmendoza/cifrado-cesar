// Librerías
import java.util.Scanner; // Leer por consola

public class CifradoCesar{

    public static void main(String[] args){
        // Declaración de variables
        String mensaje;
        int llave;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: > _ ");
        mensaje = sc.nextLine();
        System.out.print("Ingrese la llave : > _ ");
        llave = sc.nextInt();

        System.out.println(cifradoCesar(mensaje, llave));
    }

    public static String cifradoCesar(String mensaje, int llave){
        // Declaración de variables
        String alfabeto, resultado;
        char letra;
        int m, t, i, j, encontre, nueva;

        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        m = alfabeto.length();

        // Mensaje en mayusculas
        mensaje = mensaje.toUpperCase();
        t = mensaje.length();

        // Crear resultado desde primera letra
        resultado = "";
        i = 0; // "Hola"
        while (i < t) {
            // busca letra en alfabeto
            encontre = -1;
            j = 0;
            while (j < m) {
                if (mensaje.charAt(i) == alfabeto.charAt(j)) {
                    encontre = j;
                } 
                j = j + 1;
            }
            // Cambia letra de alfabeto con llave
            if (encontre >= 0) {
                nueva = encontre + llave;
                // Considerar que la siguiente posición de la letra “Z” será la “A”, y la anterior a la letra “A” será la “Z”.
                if (nueva > m){
                    nueva = nueva - m;
                }                    
                if (nueva < 0){
                    nueva = nueva + m;
                }  // hola 3
                letra = alfabeto.charAt(nueva);
            } else { // encontre = -1
                letra = alfabeto.charAt(encontre);
            }
            // Añade letra al resultado
            resultado = resultado + letra;
            i = i + 1;
        }
        return resultado;
    }
}