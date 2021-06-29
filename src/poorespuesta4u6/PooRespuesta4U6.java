package poorespuesta4u6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PooRespuesta4U6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        String nombre;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n1.Saludar\n2.Despedirse\n3.Salir"));
        
        if (opcion==1){
            nombre=JOptionPane.showInputDialog (null, "Ingrese su nombre",
"showInputDialog",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Hola "+nombre);
        } if (opcion==2){
            JOptionPane.showMessageDialog(null,"Adios");
        } if (opcion==3){
           
        }
    }
    
}
