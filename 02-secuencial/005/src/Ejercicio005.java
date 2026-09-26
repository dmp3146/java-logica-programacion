import javax.swing.JOptionPane;

public class Ejercicio005 {
    public static void main(String[] args) {

        //Datos de entrada
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para sacarle el 5 porciento"));


        //Procedimiento
        float percent = (float)(number*0.05);

        //Salida
        JOptionPane.showMessageDialog(null,"El 5 porciento del numero= "+number+ " es: "+percent);

    }
}
