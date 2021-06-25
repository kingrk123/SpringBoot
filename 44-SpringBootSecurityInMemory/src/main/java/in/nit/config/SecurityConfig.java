package in.nit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) 
			throws Exception {
		auth.inMemoryAuthentication().withUser("SAM").password("{noop}SAM").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("SYED").password("{noop}SYED").authorities("STUDENT");
		auth.inMemoryAuthentication().withUser("SRI").password("{noop}SRI").authorities("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) 
			throws Exception {
		http.authorizeRequests()
		.antMatchers("/welcome").permitAll()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/std").hasAuthority("STUDENT")
		.antMatchers("/admin").hasAuthority("ADMIN")
		.anyRequest().authenticated()
		// Form details
		.and()
		.formLogin()
		.defaultSuccessUrl("/common",true)
		// Logout
		.and()
		.logout()
		//.logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
		// ExceptionHadling
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied");

	}
}
