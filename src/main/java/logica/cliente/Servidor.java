/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Camaras
 */
public class Servidor {
        public static void main(String[] args) {
         ServerSocket servidor = null;
        Socket sc = null;
        final int puerto = 5000;
        DataInputStream in;
        DataOutputStream out;
        
        try {
           servidor = new ServerSocket(puerto); 
            System.out.println("Server iniciado");
            
            while (true) {
              sc = servidor.accept();
              
              in = new DataInputStream(sc.getInputStream());
              out = new DataOutputStream(sc.getOutputStream());
              
              String mensaje = in.readUTF();
              System.out.println(mensaje);
              out.writeUTF("Hola del servidor");
              sc.close();
                System.out.println("Cliente desconectado");
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        
        
        
    }
}
