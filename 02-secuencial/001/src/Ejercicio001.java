import javax.swing.JOptionPane;

public class Ejercicio001 {

    public static void main(String[] args) {

        // ENTRADA
        String entrada1 = JOptionPane.showInputDialog(
                "Ingrese el primer número:"
        );

        String entrada2 = JOptionPane.showInputDialog(
                "Ingrese el segundo número:"
        );

        // Convertimos los datos de String a double
        double numero1 = Double.parseDouble(entrada1);
        double numero2 = Double.parseDouble(entrada2);

        // PROCESO
        double suma = numero1 + numero2;
        double diferencia = numero1 - numero2;

        // SALIDA
        JOptionPane.showMessageDialog(
                null,
                "Suma: " + suma +
                        "\nDiferencia: " + diferencia
        );
    }
}