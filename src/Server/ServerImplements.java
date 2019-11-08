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
    public double atan(double x, double y) throws Exception {
        return Math.atan2(x, y);
    }

    @Override
    public double pow(double x, double y) throws Exception {
        return Math.pow(x,y);
    }

    @Override
    public double min(double x, double y) throws Exception {
        return Math.min(x,y);
    }

    @Override
    public double max(double x, double y) throws Exception {
        return Math.max(x,y);
    }
    
    public int potencia(int x, int y) throws Exception{
         return (int) (Math.pow(x, y));
    }
}
