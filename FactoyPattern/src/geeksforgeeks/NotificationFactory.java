/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geeksforgeeks;

/**
 *
 * @author Igrar
 */
public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel==null || channel.isEmpty()){
            return null;
        }
        if(channel.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }else if(channel.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
        }else if(channel.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }else{
            throw new IllegalArgumentException("Unknown channel"+channel);
        }
    }
}
