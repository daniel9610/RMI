/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import RMI.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DanielEsteban
 */
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {
    public ServerImplements()throws Exception{
        super();
    }

    @Override
    public int suma(int x, int y) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int resta(int x, int y) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiplica(int x, int y) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int division(int x, int y) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int potencia(int x, int y) throws Exception{
         return (int) (Math.pow(x, y));
    }
}
