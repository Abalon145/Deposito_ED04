package cuentas;
/**
 *Prueba del uso de JavaDoc
 * Al generar el JavaDoc con "Generar JavaDoc", aunque se creó el JavaDoc, este estaba vacio.
 * Tuve que utilizar "Herramientas > Analizar JavaDoc" para que se creen los comentarios que hay actualmente.
 * 
 * 
 * 
 * @author Sergio Gonzalez Llovo
 */
public class Main {
//Comentario del commit
    //Antes de configurar el acceso a GitLab, se creó una rama de Git local en el equipo desde el que se inició.

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     *
     * @param cantidad
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
