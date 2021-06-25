package in.nit.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class Mailservice {
	
	@Autowired
	private JavaMailSender sender; //HAS-A
	
	public boolean sendEmail(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			FileSystemResource file) 
	
	{
		boolean flag=false;
		try {
			//1. Create MimeMessage
			MimeMessage message=sender.createMimeMessage();
			
			//2. Create Mime Message Helper class object
			MimeMessageHelper helper=new MimeMessageHelper(message, file!=null?true:false);
			
			//3. provide message details
			helper.setTo(to);
			if(cc!=null)
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc);
			helper.setSubject(subject);
			//helper.setText(text);
			//send text as HTML Format
			helper.setText(text,true);
			
			if(file!=null) {//if file exist then send
				helper.addAttachment(file.getFilename(), file);
			}
			
			//4. send email
			sender.send(message);
			flag=true;
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}
}

