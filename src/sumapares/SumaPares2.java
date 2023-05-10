
package sumapares;

/**
 *
 * @author  El chistes (Kevin Moreno Rojas)
 *
 * Ciclo for Suma de los M primeros números pares.
 * El bucle puede diseñarse con  * un incremento de 2.
 *
 */
public class SumaPares2 {
    final int M = 12;
        int suma = 0;
        
        public void sumaparr (){
            for (int n = 2; n <= 2 * M; n += 2) {
            suma += n;
        }
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
        }

    public static void main(String[] args) {
        SumaPares2 sumaparr = new SumaPares2();
        sumaparr.sumaparr();
    }
}
