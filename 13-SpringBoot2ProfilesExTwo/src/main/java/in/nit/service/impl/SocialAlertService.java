package in.nit.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
@Profile("htc")
public class SocialAlertService implements AlertService {

	@Override
	public void showMsg() {
		System.out.println("FROM HTC IT-SOCIAL SERVICE");
	}

}
