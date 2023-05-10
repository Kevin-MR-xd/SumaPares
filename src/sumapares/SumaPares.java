package sumapares;

/**
 *
 * @author El chistes (Kevin Moreno Rojas)
 *
 * Ciclo for
 * Suma de los M primeros números pares.
 *
 */
public class SumaPares {
    final int M = 12;
        int suma = 0;
        
        public void sumapar (){
     for (int n = 1; n <= M; n++) {
            suma += 2 * n;
        }
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);   
}
    public static void main(String[] args) {
        SumaPares sumapar = new SumaPares();
        sumapar.sumapar();
    }
}
