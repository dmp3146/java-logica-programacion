import javax.swing.JOptionPane;

public class Ejercicio004 {
    public static void main(String[] args) {

        //Datos de entrada
        int ladoSalon = 0;
        ladoSalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de lado de salon"));


        //Procedimiento
        float puerta= ladoSalon/3;
        float perimetro = 4*(ladoSalon);
        float distanciaTotal= perimetro-puerta;



        //Datos de salida
        JOptionPane.showMessageDialog(null,"El valor de lado de salon es: "+puerta);
        JOptionPane.showMessageDialog(null,"El valor de lado de salon es: "+perimetro);
        JOptionPane.showMessageDialog(null,"El valor de lado de salon es: "+distanciaTotal);






    }
}