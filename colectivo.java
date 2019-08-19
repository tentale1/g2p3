import java.util.Scanner;

/**
 * Programa para hallar viajes, ganancia y costo
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190817
 */
public class colectivo
{
    public static void main(String[] args)
    {
        double n, cap=40, tk=10000, cost=2000;
        double viaj, gan, prop;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("El valor del pasaje es de 10.000 CoP, existe capacidad para 40 personas");
        
        System.out.println("Cuantas personas viajan en el colectivo");
        n = Teclado.nextDouble();
        
        viaj = Math.ceil(n/cap);
        gan = n*tk;
        prop = n*cost;
                 
        System.out.println("El bus hará " + viaj + " viajes");
        System.out.println("Todos los turistas pagaron $ " + gan + " CoP");
        System.out.println("El conductor paga al propietario $ " + prop + " CoP");

    }
}
