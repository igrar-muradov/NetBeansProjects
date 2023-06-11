/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author Igrar
 */
public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory nf = new NotificationFactory();
        
        Notification notif1 = nf.createNotification("Sms");
        
        notif1.notifyUser();
    }
}
