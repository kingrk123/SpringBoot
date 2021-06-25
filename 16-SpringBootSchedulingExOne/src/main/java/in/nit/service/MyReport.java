package in.nit.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReport {
	
		//1000 mill sec = 1 sec
		//@Scheduled(initialDelay = 5000,fixedDelay = 2000)
		//@Scheduled(cron = "2 * * * * *")//point of time
		@Scheduled(cron = "*/2 * * * * *")//period of time
		public void genRepo() {
			System.out.println("Hello  "+new Date());
		}
	}
