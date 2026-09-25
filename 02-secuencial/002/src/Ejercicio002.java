import javax.swing.*;

public class Ejercicio002 {
    public static void main(String[] args) {

        //Datos de Entrada
        String monday=JOptionPane.showInputDialog("Ingrese Tiempo del lunes:");
        String wednesday=JOptionPane.showInputDialog("Ingrese Tiempo del Miercoles:");
        String friday=JOptionPane.showInputDialog("Ingrese Tiempo del Viernes");


        //Conversion de Datos
        float mondayTime=Float.parseFloat(monday);
        float wednesdayTime=Float.parseFloat(wednesday);
        float fridayTime=Float.parseFloat(friday);


        //Proceso
        float averageTime=(float)((mondayTime+wednesdayTime+fridayTime)/3);

        //Salida
        JOptionPane.showMessageDialog(null,"Tiempo promedio de la semana es: "+averageTime);


    }
}