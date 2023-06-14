package курсовая;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.time.LocalDate;
import java.util.Properties;

public class SendMessage {
    SendMessage(String file) {

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true");


        final String username = "parservalut@gmail.com";
        final String password = "abarlacheexahdxa"; //пароль приложений
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("parservalut@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO, InternetAddress.parse("smicov01@inbox.ru"));
            message.setSubject("Парсинг сайта ЦБ РФ");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Актуальный курс валют на " + LocalDate.now());
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(file);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Сообщение отправлено!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
