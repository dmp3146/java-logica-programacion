import javax.swing.JOptionPane;

public class Ejercicio008 {
    public static void main(String[] args) {

        //Datos de entrada
        float valor_total_inicial = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el valor de metro cuadrados comprados: "));
        float cuotaInicial = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese lo que desea pagar de cuota inicial: "));


        //Procedimiento
        float totalPagar;
        float totalMenosCuota;
        float cuotas;
        totalPagar=valor_total_inicial*1000000;
        totalMenosCuota=totalPagar-cuotaInicial;
        cuotas=totalMenosCuota/12;


        //Salida

        JOptionPane.showMessageDialog(null, "El total a pagar por el terreno es: $"+totalPagar);
        JOptionPane.showMessageDialog(null, "El total a pagar menos cuota inicial es: $"+totalMenosCuota);
        JOptionPane.showMessageDialog(null, "El valor de las cuotas para pagar en 12 meses es: $"+cuotas);



    }
}
