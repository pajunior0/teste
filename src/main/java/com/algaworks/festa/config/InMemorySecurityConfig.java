package com.algaworks.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void ConfigureGlobal(AuthenticationManagerBuilder buider) throws Exception{
		
		buider
			.inMemoryAuthentication()
			.withUser("normandes").password("123").roles("USER")
			.and()
			.withUser("thiago").password("123").roles("USER")
			.and()
			.withUser("alexandre").password("123").roles("USER")
			.and()
			.withUser("paulo").password("@123").roles("USER");
		
	}
}
