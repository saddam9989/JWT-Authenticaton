package com.easy;

import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@SpringBootApplication
public class JwtTokenanddecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtTokenanddecodeApplication.class, args);
		

	          String secret_key = "J@!gt*K";
		 
		
			
			// code to test generated Token
				String token= JwtUtil.generateToken("Token1", secret_key);
				System.out.println("------------------------TOKEN----------------------------------------------------");
				System.out.println(token);
				System.out.println();
				System.out.println("------------------------CLAIMS---------------------------------------------------");
		

		    //code to test parsed token : Claims
			
		   Claims claims= JwtUtil.getClaims(token, secret_key);
		   
		    System.out.println("Token ID: "+claims.getId());
			System.out.println("Token Subject: "+claims.getSubject());
			System.out.println("Token Issuer: "+claims.getIssuer());
			System.out.println("Token Issue Date: "+claims.getIssuedAt());
			System.out.println("Token Expiration Date: "+claims.getExpiration());
			System.out.println("Token Audience: "+claims.getAudience());
		
	}

}
