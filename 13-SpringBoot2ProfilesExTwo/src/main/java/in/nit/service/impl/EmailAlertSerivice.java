package in.nit.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
@Profile("default")
public class EmailAlertSerivice implements AlertService {

	@Override
	public void showMsg() {
		System.out.println("FROM DEFAULT-EMAIL SERVICE");
	}

}