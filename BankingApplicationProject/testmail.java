// import javax.mail.*;
// import javax.mail.internet.*;
// import java.util.Properties;

// public class testmail {
//     public static void main(String[] args) {
//         try {

//             final String username = "rajthakur8827142011@gmail.com";
//             final String password = "Raj@882714";
//             String to = "rajthakur8827142011@gmail.com";

//             Properties props = new Properties();
//             props.put("mail.smtp.auth", "true");
//             props.put("mail.smtp.starttls.enable", "true");
//             props.put("mail.smtp.host", "smtp.gmail.com");
//             props.put("mail.smtp.port", "587");

//             Session session = Session.getInstance(props, new Authenticator() {
//                 protected PasswordAuthentication getPasswordAuthentication() {
//                     return new PasswordAuthentication(username, password);
//                 }
//             });

//             try {
//                 Message message = new MimeMessage(session);
//                 message.setFrom(new InternetAddress(username));
//                 message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//                 message.setSubject("Hello, this is a test email");
//                 message.setText("This is the email content");

//                 Transport.send(message);

//                 System.out.println("Email sent successfully.");
//             } catch (MessagingException e) {
//                 e.printStackTrace();
//                 System.out.println(e);
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class testmail {
    public static void main(String[] args) {
        // Set up mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "your-smtp-server.com"); // Replace with your SMTP server
        properties.put("mail.smtp.port", "587"); // Replace with your SMTP port
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // For secure transport

        // Create a Session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rajthakur8827142011@gmail.com", "Raj@882714");
            }
        });

        try {
            // Create a MimeMessage
            Message message = new MimeMessage(session);

            // Set the sender's email address
            message.setFrom(new InternetAddress("rajthakur8827142011@gmail.com"));

            // Set the recipient's email address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("rajthakur8827142011@gmail.com"));

            // Set the email subject and content
            message.setSubject("Hello, this is a test email");
            message.setText("This is the email content.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
