package com.espo.security;

import java.io.IOException;
import java.util.Set;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.accept.ContentNegotiationStrategy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{


	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("configure");
		super.configure(auth);
		auth.inMemoryAuthentication()
			.withUser("operatore").password(passwordEncoder().encode("operatore1234")).roles("OPERATORE")
			.and()
			.withUser("admin").password(passwordEncoder().encode("admin1234")).roles("ADMIN");
	}


	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); 
		
	}
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		System.out.println("http");
		super.configure(http);
		
		http
	      .csrf().disable()
	      .authorizeRequests()
	      .antMatchers("/admin/**").hasRole("ADMIN")
	      .antMatchers("/gestione/**").hasRole("OPERATORE")
	      .antMatchers("/index.html").permitAll()
	      .anyRequest().authenticated()
	      .and()
	      .formLogin()
	      .loginPage("/login.html")
	      .loginProcessingUrl("/perform_login")
	      .defaultSuccessUrl("/home.html", true)
	      .failureUrl("/login.html?error=true")
	      //.failureHandler(authenticationFailureHandler())
	      .and()
	      .logout()
	      .logoutUrl("/perform_logout")
	      .deleteCookies("JSESSIONID");
	      //.logoutSuccessHandler(logoutSuccessHandler());
	      
	}

	
	
	
	
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		UserDetails admin = User.builder()
//				.username("admin")
//				.password("admin1234")
//				.roles("ADMIN")
//				.build();
//		
//		UserDetails operatore = User.builder()
//				.username("operatore")
//				.password("operatore1234")
//				.roles("OPERATORE")
//				.build();
//		
//		return new InMemoryUserDetailsManager(
//				admin,
//				operatore
//				);
//	}


	

	
	
}
