package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int edad , acumulador = 0;
        Scanner Entrada = new Scanner(System.in);
        
        for(int i = 1; i < 15 ; i++){
            System.out.println("Favor ingresar la edad del estudiante");
            edad = Entrada.nextInt();
            acumulador = acumulador + edad;
        }
        System.out.println("El promedio de edad de todo el grupo es: " +  acumulador / 15);



        


    }
}
