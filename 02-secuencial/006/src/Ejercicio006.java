import javax.swing.JOptionPane;

public class Ejercicio006 {

    public static void main(String[] args) {

        //Datos de entrada
        float velocity= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad del auto"));
        float time = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo de recorrido del auto"));


        //Procedimiento
        float distance;
        distance = velocity*time;


        //Salida
        JOptionPane.showMessageDialog(null, "La distancia recorrida por el auto es de: " + distance);
    }
}