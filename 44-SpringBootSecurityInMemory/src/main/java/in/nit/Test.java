package in.nit;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String enpwd = encoder.encode("admin");
		System.out.println(enpwd);

	}

}
