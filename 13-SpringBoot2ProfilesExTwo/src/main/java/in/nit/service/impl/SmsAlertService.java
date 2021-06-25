package in.nit.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
@Profile("nit")
public class SmsAlertService implements AlertService {

	@Override
	public void showMsg() {
		System.out.println("FROM NARESH IT-SMS SERVICE");
	}

}


