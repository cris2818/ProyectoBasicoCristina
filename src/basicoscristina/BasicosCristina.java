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
    public static void main(String[] args) {
        numericos(); //Llamada al método
    }
    
}
