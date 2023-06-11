/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import lombok.SneakyThrows;
import util.FileUtility;

/**
 *
 * @author Igrar
 */
public class TCPServerReceiveFile {

    @SneakyThrows
    public static void main(String[] args) {

        ServerSocket outFirstServerSocket = new ServerSocket(6789);

        while (true) {
            System.out.println("Mesaj gozleyir...");
            Socket connection = outFirstServerSocket.accept();//gozleyecek burda

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());

            byte[] arr = readMessage(dataStream);
            System.out.println("message length = " + arr.length);
            FileUtility.writeBytes("C:\\Users\\Igrar\\Desktop\\sekil.jpg", arr);
        }

    }

    @SneakyThrows
    public static byte[] readMessage(DataInputStream din) {
        int msgLen = din.readInt();
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }

}
