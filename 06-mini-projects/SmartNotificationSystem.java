// January Mini Console Project #4
// Smart Notification System
// Author: Nikhil Parmar


import java.util.Scanner;

class Notification {
    String message;
    String receiver;

    Notification(String msg, String rec) {
        this.message = msg;
        this.receiver = rec;
    }

    void send() {
        System.out.println();
        System.out.println("Sending Notification...");
    }
}

class Email extends Notification {

    Email(String msg, String rec)  {
        super(msg, rec);
    }

    @Override
    void send() {
        System.out.println();
        System.out.println(message + ", sended via email to " + receiver);
    }
}

class SMS extends Notification {

    SMS(String msg, String rec)  {
        super(msg, rec);
    }

    @Override
    void send() {
        System.out.println();
        System.out.println(message + ", sended via SMS to " + receiver);
    }
}

class Whatsapp extends Notification {

    Whatsapp(String msg, String rec)  {
        super(msg, rec);
    }

    @Override
    void send() {
        System.out.println();
        System.out.println(message + ", sended via Whatsapp Message to " + receiver);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        String msg;
        String receiver;
        int ch;

        System.out.println("-----------------------------");
        System.out.println("SMART NOTIFICATION SYSTEM ! ");
        System.out.println("-----------------------------");
        System.out.print("Enter Your Message: ");
        msg = ip.nextLine();
        System.out.print("Enter Receiver Name: ");
        receiver = ip.nextLine();

        System.out.println("\nSelect Any One form it :");
        System.out.println("1. For Email Notification.");
        System.out.println("2. For SMS Notification.");
        System.out.println("3. For Whatsapp Notification.");
        ch = ip.nextInt();

        switch (ch) {
            case 1:
                Notification n1 = new Email(msg, receiver);
                n1.send();
                break;
        
            case 2:
                Notification n2 = new SMS(msg, receiver);
                n2.send();
                break;

            case 3:
                Notification n3 = new Whatsapp(msg, receiver);
                n3.send();
                break;

            default:
                System.out.println("wrong choice! try again...");
                break;
        }
    }
}