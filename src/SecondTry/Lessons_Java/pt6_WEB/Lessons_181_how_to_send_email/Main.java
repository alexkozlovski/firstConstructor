package SecondTry.Lessons_Java.pt6_WEB.Lessons_181_how_to_send_email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 23.09.2018.
 */
public class Main {

    public static void main(String[] args) throws IOException, MessagingException {
        final Properties properties=new Properties();
        properties.load(Main.class.getClassLoader().getResourceAsStream("mail.properties"));


        Session mailSession=Session.getDefaultInstance(properties);
        MimeMessage message=new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("shmitqwert@gmail.com"));
        message.addRecipient(Message.RecipientType.TO,new InternetAddress("alexkozlovski@mail.ru"));
        message.setSubject("hehe");
        message.setText("heheheheh heheh heheh eheh as:.");

        Transport tr=mailSession.getTransport();
        tr.connect(null,"81675356378za");
        tr.sendMessage(message,message.getAllRecipients());
        tr.close();



    }
}
