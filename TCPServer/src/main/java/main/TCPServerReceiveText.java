/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import lombok.SneakyThrows;

/**
 *
 * @author Igrar
 */
public class TCPServerReceiveText {
    @SneakyThrows
    public static void main(String[] args){
        
        ServerSocket outFirstServerSocket = new ServerSocket(6789); 
        
        while(true){
            System.out.println("Mesaj gozleyir...");
            Socket connection = outFirstServerSocket.accept();//gozleyecek burda
            
            InputStream is = connection.getInputStream();
            InputStreamReader inReader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(inReader);
            
            String message = bReader.readLine();
            System.out.println("MESSAGE is: "+message);
        }
        
    }
}
