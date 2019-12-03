package basicoscristina;

public class BasicosCristina {

    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {
        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        elMasPeque = 127;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
        System.out.print("Valor byte ");
        System.out.println(elMasPeque);
    }
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
    /**
     * Método para mostrar ejemplos de tipos lógicos.
     */
    public static void logicos() {

        boolean igual; 
        boolean mayor;
        boolean menor;
        boolean b1;
        boolean b2;
        boolean b3;
        boolean b4;

        //Ejemplos de asignación de valores a las variables de tipo lógico
        igual = (7==10);
        mayor = (10>3);
        menor = (5<9);
        b1 = true;
        b2 = true;
        b3 = false;
        b4 = false;
        
        //Mostrar en pantalla el contendido de las variables de tipo lógico        
        System.out.println("7 es igual a 10: " + igual);
        System.out.println("10 es mayor que 3: " + mayor);
        System.out.println("5 es menor que 9: " + menor);
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));
        System.out.println("b3 && b1 = " + (b3 && b1));
        System.out.println("b3 && b4 = " + (b3 && b4));        
        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("b1 || b3 = " + (b1 || b3));
        System.out.println("b3 || b1 = " + (b3 || b1));
        System.out.println("b3 || b4 = " + (b3 || b4));        
        System.out.println("Not b1 = " + (!b1));
        System.out.println("Not b2 = " + (!b2));
        System.out.println("Not b3 = " + (!b3));
        System.out.println("Not b4 = " + (!b4));             
    }
    public static void main(String[] args) {
        numericos(); //Llamada al método
        cadenas(); //Llamada al método
        logicos(); //Llamada al método
    }
    
}
