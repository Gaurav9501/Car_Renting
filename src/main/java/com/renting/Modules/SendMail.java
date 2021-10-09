package com.renting.Modules;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class SendMail {

	public boolean sendMail(String to,String message, String subject) {
		boolean flag = false;
		String host = "smtp.gmail.com";
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		Session session = Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("blah9501blah@gmail.com","Activa@9501");
			}			
		});
		
		session.setDebug(true);
		
		MimeMessage mm = new MimeMessage(session);
		
		try {
			mm.setFrom("blah9501blah@gmail.com");
			mm.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			mm.setSubject(subject);
			mm.setText(message);
			Transport.send(mm);
			System.out.println("Sent Successfully");
			flag = true;
			return flag;
		}catch(Exception e) {
			e.printStackTrace();
			return flag;
		}			
	}
}
