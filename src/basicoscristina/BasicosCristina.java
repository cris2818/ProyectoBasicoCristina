package basicoscristina;

public class BasicosCristina {

    /**
     * Método para mostrar ejemplos de tipo cadenas.
     */
    public static void cadenas(){

        //Tipo String
        String cadena1;
        String cadena2;
        String frase;

        //Ejemplos de asignación de valores a la variable String
        cadena1 = "Hola";
        cadena2 = "Esta es una variable de tipo String";
        frase = cadena1 + " " + cadena2;

        //Mostrar en pantalla el contendido de las variables de tipo String.
        System.out.print("Cadena 1: ");
        System.out.println(cadena1);
        System.out.print("Cadena 2: ");
        System.out.println(cadena2);
        System.out.print("Resultado de concatenar cadena 1 y cadena 2: ");
        System.out.println(frase);
    }
    public static void main(String[] args) {
        cadenas(); //Llamada al método
    }
    
}
