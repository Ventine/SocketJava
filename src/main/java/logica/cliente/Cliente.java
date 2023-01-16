/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package logica.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Camaras
 */
public class Cliente {

    public static void main(String[] args) {
        final String host = "localhost";
        final int puerto = 5000;
        DataInputStream in;
        DataOutputStream out;        
        try {
        Socket sc = new Socket(host, puerto);
        in = new DataInputStream(sc.getInputStream());
        out = new DataOutputStream(sc.getOutputStream());
        
        out.writeUTF("Hola desde el cliente");
        
        String mensaje = in.readUTF();
        System.out.println(mensaje);    
        
        sc.close();

        } catch (Exception e) {
             System.out.println("Error" + e);
           
        }
        
    }
}








































