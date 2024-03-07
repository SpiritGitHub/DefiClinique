package com.defitech.DefiClinique;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@SpringBootApplication
public class DefiCliniqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefiCliniqueApplication.class, args);
	}

	@RestController
	public static class LoginController {

		@PostMapping("/api/login")
		public <HttpServletRequest> ResponseEntity<LoginResponse> login(@RequestHeader(value = "Authorization", required = false) String authHeader, HttpServletRequest request) {
			// Authenticate the user
			String username = authenticate(authHeader);

			// If the user is authenticated successfully, return a success response
			if (username != null) {
				ResponseEntity<LoginResponse> ok = ResponseEntity.ok(new LoginResponse(username));
				return ok;
			} else {
				// If the user is not authenticated, return a failure response
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
			}
		}

		private String authenticate(String authHeader) {
			// Extract the username and password from the authorization header
			String[] credentials = extractCredentials(authHeader);

			if (credentials != null && authenticate(credentials[0], credentials[1])) {
				return credentials[0];
			} else {
				return null;
			}
		}

		private String[] extractCredentials(String authHeader) {
			if (authHeader != null && authHeader.startsWith("Basic ")) {
				// Decode the base64 encoded authorization header
				String decodedHeader = new String(Base64.getDecoder().decode(authHeader.substring(6)));

				// Extract the username and password
				return decodedHeader.split(":");
			}

			return null;
		}

		private boolean authenticate(String username, String password) {
			// Authenticate the user using the username and password
			// You can use a database, LDAP, or any other authentication mechanism
			return "testuser".equals(username) && "testpassword".equals(password);
		}
	}

	@Setter
	@Getter
	static class LoginResponse {

		private String username;

		public LoginResponse(String username) {
			this.username = username;
		}

	}
}