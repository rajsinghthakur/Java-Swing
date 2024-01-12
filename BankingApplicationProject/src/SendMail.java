
//import com.sun.jdi.connect.Transport;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendMail {

    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();
    final String PASSSWORD = "elbbfmlofzzcsnts"; // Password of the Goole(gmail) account
    final String FROM_ADDRESS = "risingstarsbank@gmail.com"; // From addresss

    public SendMail() {
    }

    public static void main(String[] args) {
        SendMail email = new SendMail();
        // Sending test email
        String accountnumber = "1810411905";
        String password = "raj@190";
        email.createAndSendEmail("risingstarsbank@gmail.com", "Create bank account ",
                " Dear customer,  Congratulations your account has been successfully created in RS BANK,   Account Number :- "
                        + accountnumber + "   PIN : " + password + "    Warning !! Do not share your pin number");
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }

    private void sendEmailMessage() {

        // create a object of account:

        // Create email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("risingstarsbank@gmail.com", "elbbfmlofzzcsnts");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("risingstarsbank@gmail.com")); // Set from address of the email
            message.setContent(msgText, "text/html"); // set content type of the email

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(B11_Account.sendmail)); // Set
                                                                                                          // email
            // recipient

            message.setSubject("RS BANK"); // Set email message subject
            Transport.send(message); // Send email message

            System.out.println("Account successfully created.....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}