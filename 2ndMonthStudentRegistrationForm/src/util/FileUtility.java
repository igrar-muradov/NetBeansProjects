/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Igrar
 */
public class FileUtility {

// Serialize etmek baytlara chevirmek demekdir
//Obyekti fayldan oxumaq
    public static Object readFileDeserialize(String fileName){
        Object obj = null;
        try ( FileInputStream fin = new FileInputStream(fileName);  ObjectInputStream in = new ObjectInputStream(fin);) {
            obj = in.readObject();
        }finally {
            return obj;
        }
    }
//Obyekti fayla yazmaq

    public static void writeObjectToFile(Serializable obj, String fileName) {
        try(FileOutputStream fout = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fout);){
        out.writeObject(obj);    
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
