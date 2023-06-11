/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fayllar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Igrar
 */
public class FileUtility {

// Stringi fayla yazmaq uchun
    private static void writeIntoFile(String fileName, String text, Boolean append) throws IOException {
        FileWriter fw = new FileWriter(fileName, append);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);
    }

// Stringi fayla yazmaq uchun
    public static void writeIntoFile(String fileName, String text) throws IOException {
        writeIntoFile(fileName, text, false);
    }
// String olan fayli update elemek uchun

    public static void appendToFile(String fileName, String text) throws IOException {
        writeIntoFile(fileName, text, true);
    }
//Baytlari fayla yazmaq

    public static void writeBytes(String fileName, byte[] data) throws Exception {
        FileOutputStream fop = new FileOutputStream(fileName);
        fop.write(data);
        fop.flush();
        fop.close();
    }
//Text faylindan setir-be-setir oxumaq

    public static String read(String fileName) throws Exception {
        InputStream in = new FileInputStream(fileName);
        InputStreamReader r = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(r);
        String line = null;
        String result = "";
        while ((line = reader.readLine()) != null) {
            result += line + "\n";
        }
        return result;
    }
//Fayli Bayt ile oxumaq

    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);
        FileInputStream fin = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fin.read(data);
        return data;
    }
// Serialize etmek baytlara chevirmek demekdir
//Obyekti fayldan oxumaq

    public static Object readFileDeserialize(String fileName) throws Exception {
        Object obj = null;
        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fin);
        obj = in.readObject();
        return obj;
    }
//Obyekti fayla yazmaq

    public static void writeObjectToFile(Serializable obj, String fileName) throws Exception {
        FileOutputStream fout = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(obj);
    }

//Nio ile fayla yazmaq    
    public static void writeBytesNio(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);
    }
//Nio ile fayldan oxumaq   
    public static byte[] readBytesNio(String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        byte[] data = Files.readAllBytes(filePath);
        return data;
    }

}
