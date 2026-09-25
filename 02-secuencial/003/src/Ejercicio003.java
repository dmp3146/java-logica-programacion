import javax.swing.JOptionPane;

public class Ejercicio003 {
    public static void main(String[] args) {

        //Entrada
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));


        //Solucion

        float raiz;
        raiz = (float) Math.sqrt(numero);

        float potencia = (float) Math.pow(numero, 2);


        //Salida
        JOptionPane.showMessageDialog(null,"La raiz es: "+raiz);
        JOptionPane.showMessageDialog(null,"La potencia es: "+potencia);
    }
}