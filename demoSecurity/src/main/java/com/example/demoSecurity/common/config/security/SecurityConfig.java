package com.example.demoSecurity.common.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	//Autenticación
	@Bean
	public InMemoryUserDetailsManager  userDetailsService() {
		
		UserDetails user1 = User
				.withUsername("user1")
				.password(passwordEncoder().encode("user1"))
				.roles("USER")
				.build();
		
		UserDetails user2 = User
				.withUsername("user2")
				.password(passwordEncoder().encode("user2"))
				.roles("USER")
				.build();
		UserDetails admin = User
				.withUsername("admin")
				.password(passwordEncoder().encode("admin"))
				.roles("ADMIN")
				.build();
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(user1, user2, admin);
		return manager;		
		
	}
	
	//Autorización
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests((authz) -> authz
				.requestMatchers(HttpMethod.GET, "/buscador","/").permitAll()
				.requestMatchers(HttpMethod.GET, "/css/**", "/js/**", "/img/**").permitAll()
				.requestMatchers("/admin/**").hasAnyRole("ADMIN")
				.requestMatchers("/h2-console/**").hasAnyRole("ADMIN")
				.anyRequest().authenticated());
		
		//Cabecera. Mirar como se hace ahora
		http.headers(headers -> headers.frameOptions().sameOrigin());
		
		http.formLogin((form) -> form
				.loginPage("/login")
				.failureUrl("/loginError")
				.successForwardUrl("/buscador").permitAll());
		http.logout((logout) -> logout.permitAll());
		
		//Cabecera. Mirar como se hace ahora
		http.exceptionHandling().accessDeniedPage("/accessDenied");
		
		
		
		return http.build();
		
	}
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
