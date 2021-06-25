package in.nit.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

	@Value("${app.secret}")
	private String secret;

	//7. validate token user name and request user also expDate
	public boolean validateToken(String token, String username) {
		String usernameInToken = getUsername(token);
		return (usernameInToken.equals(username) && !isTokenExpired(token));
	}

	//6. Check Current and Exp Date
	private boolean isTokenExpired(String token) {
		final Date expiration = getExpDate(token);
		return expiration.before(new Date());
	}


	//4.Read username
	public String getUsername(String token) {
		return getClaims(token).getSubject();
	}

	//3. read ExpDate
	public Date getExpDate(String token) {
		return getClaims(token).getExpiration();
	}

	//2.get claims
	private Claims getClaims(String token) {
		return Jwts.parser()
				.setSigningKey(secret)
				.parseClaimsJws(token)
				.getBody();
	}


	//1.Generate the token
	public String generateToken(
			String subject) {

		return Jwts.builder()
				.setSubject(subject)
				.setIssuer("NareshItRaghu")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(15)))
				.signWith(SignatureAlgorithm.HS512, secret.getBytes())
				.compact();
	}
}
