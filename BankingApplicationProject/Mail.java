import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class Mail {

    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();
    final String USER_NAME = "rajthakur8827142011@gmail.com"; // User name of the Goole(gmail) account
    final String PASSSWORD = "cqponcbythxmqpqn"; // Password of the Goole(gmail) account
    final String FROM_ADDRESS = "rajthakur8827142011@gmail.com"; // From addresss

    public Mail() {
    }

    public static void main(String[] args) {
        Mail email = new Mail();
        // Sending test email
        email.createAndSendEmail("rajthakur8827142011@gmail.com", "Create bank account ho chuka hai",
                "Congratulations !!! \nyou are account has been created in info branch: ");
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }

    private void sendEmailMessage() {

        // Create email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("rajthakur8827142011@gmail.com", "cqponcbythxmqpqn");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("rajthakur8827142011@gmail.com")); // Set from address of the email
            message.setContent(msgText, "text/html"); // set content type of the email

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("rajthakur8827142011@gmail.com")); // Set
            // email
            // recipient

            message.setSubject("RS BANK"); // Set email message subject
            Transport.send(message); // Send email message

            System.out.println("sent email successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }

}