package com.example.demo.utill;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtill {
	@Value("${app.secrate}")
	private String secrate;

	public String generateTokens(String subject) {
		
		return Jwts.builder().setSubject(subject).setIssuer("Mr. Shobhit").
				setIssuedAt(new Date(System.currentTimeMillis())).
				setExpiration(new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(15))).
				signWith(SignatureAlgorithm.HS512, secrate.getBytes()).compact();
	}
}
