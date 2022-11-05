
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Juan Carlos
 */
public class Calculadora {

static Scanner MyObj = new Scanner(System.in);    
    
    public static void main(String[] args) {
        
        Operaciones op = new Operaciones();
        OperacionesAvanzadas opav = new OperacionesAvanzadas();
        
        System.out.println("Ingresa el primer numero: ");
        double v1 = MyObj.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double v2 = MyObj.nextDouble();
        System.out.println("Ingresa un tercer numero para las operaciones avanzadas: ");
        double v3 = MyObj.nextDouble();
        
        double a = op.suma(v1, v2);
        double b = op.resta(v1, v2);
        double c = op.multi(v1, v2);
        double d = op.divis(v1, v2);
        
        double e = opav.seno(v3);
        double f = opav.coseno(v3);
        double g = opav.tangente(v3);
        
        System.out.println("\nOPERACIONES BASICAS\n");
        
        System.out.println("La suma de " +v1 + " + " + v2 + " = " + a);
        System.out.println("La resta de " +v1 + " - " + v2 + " = " + b);
        System.out.println("La multiplicacion de " +v1 + " * " + v2 + " = " + c);
        System.out.println("La division de " +v1 + " / " + v2 + " = " + d);
        
        System.out.println("\nOPERACIONES AVANZADAS\n");
        
        System.out.println("El seno de " +v3 + " = " + e);
        System.out.println("El coseno de " +v3 + " = " + f);
        System.out.println("La tangente de " +v3 + " = " + g);
    }
    
}
