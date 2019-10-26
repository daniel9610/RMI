/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author BOG-A410-E-016
 */
public class MainServer {
      public static void main(String[] args) {
        try{
        Registry miRegistry = LocateRegistry.createRegistry(1234);
        miRegistry.rebind("ejemplo matematicas",new ServerImplements());
            System.out.println("Servidor ON");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
