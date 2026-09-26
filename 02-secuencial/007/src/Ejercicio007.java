import javax.swing.JOptionPane;

public class Ejercicio007 {
    public static void main(String[] args) {


        //Datos de entrada
       int stepnumber;
       stepnumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Pasos: "));

       //Procedimiento
        float cm = stepnumber * 52;
        float m = cm/ 100;
        float km = m/ 1000;


        // Salida

        JOptionPane.showMessageDialog(null,"Los centimentros recorridos por el atleta son"+cm);
        JOptionPane.showMessageDialog(null, "Los metro recorridos por el atleta son"+m);
        JOptionPane.showMessageDialog(null, "Los kilometros recorridos por el atleta son"+km);

    }
}