package br.com.empresa.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

	@GetMapping("/public")
	public String publicRoute() {
		return "Rota publica";
	}
	
	@GetMapping("/private")
	public String cookie(@AuthenticationPrincipal OidcUser principal) {
		return " Acesso ok ";
	}
}
