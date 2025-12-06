interface MessageSender {
void send();
}
class SMS implements MessageSender {
public void send() {
System.out.println("Sending SMS message");
}
}
class Email implements MessageSender {
public void send() {
System.out.println("Sending Email message");
}
}
class Notification {
private MessageSender sender;
public Notification(MessageSender sender) {
this.sender = sender;
}
public void notifyUser() {
sender.send();
}
}
public class DIPLab {
public static void main(String[] args) {


Notification n1 = new Notification(new SMS());
Notification n2 = new Notification(new Email());
n1.notifyUser();
n2.notifyUser();
}
}