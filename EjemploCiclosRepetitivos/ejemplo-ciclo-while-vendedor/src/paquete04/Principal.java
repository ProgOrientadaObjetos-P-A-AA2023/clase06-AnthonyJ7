/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import java.util.Scanner;
import paquete02.Vendedor;
/**
 *
 * @author ASUS
 */
class Principal {
    
    public static void main(String[]args){
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        int bandera = 1;
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        
        while (bandera <= 3) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, 
                    autos);
            v.calcularPagoMensual();
            
            // funciona para que las cadenas que se vayan agregando tambien se vayan acumulando
            
            cadenaFinal = String.format("%sDatos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n\n",
                    cadenaFinal,
                    v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            
            bandera = bandera + 1;

        }
        // cuando se sale del ciclo repetitivo debemos presentar en pantalla
        // el valor de cadena final
        System.out.printf("%s\n", cadenaFinal);
    }
}

