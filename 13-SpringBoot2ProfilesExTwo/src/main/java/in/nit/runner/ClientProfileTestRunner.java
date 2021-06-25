package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
public class ClientProfileTestRunner
	implements CommandLineRunner
{
	@Autowired // search Impl class object and link
	private AlertService service; //HAS-A
	
	
	@Override
	public void run(String... args) throws Exception {
		service.showMsg();
	}
}

