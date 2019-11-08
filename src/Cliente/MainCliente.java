/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import RMI.RemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
/**
 *
 * @author BOG-A410-E-016
 */
public class MainCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String valora = JOptionPane.showInputDialog("Ingrese el valor del numero Uno");
            String valorb = JOptionPane.showInputDialog("Ingrese el valor del numero Dos");
            double a = Double.parseDouble(valora);
            double b = Double.parseDouble(valorb);
            Registry miRegistro = LocateRegistry.getRegistry("127.0.0.1",1234);
            RemoteInterface s = (RemoteInterface) miRegistro.lookup("Matematicas");
            JOptionPane.showMessageDialog(null,"Resultado atan : "+s.atan(a,b));
            JOptionPane.showMessageDialog(null,"Resultado potencia : "+s.pow(a,b));
            JOptionPane.showMessageDialog(null,"Resultado minimo : "+s.min(a,b));
            JOptionPane.showMessageDialog(null,"Resultado maximo : "+s.max(a,b));            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
