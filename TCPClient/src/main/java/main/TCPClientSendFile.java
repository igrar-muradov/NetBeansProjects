/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import lombok.SneakyThrows;
import util.FileUtility;

/**
 *
 * @author Igrar
 */
public class TCPClientSendFile {

    @SneakyThrows
    public static void main(String[] args){

        Socket socket = new Socket("localhost", 6789);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
        byte[] bytes = FileUtility.readBytes("C:\\Users\\Igrar\\Pictures\\picture.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
       
    }
}
